import java.util.Scanner;

class NumberProcessor implements Runnable {
    private int cycles;
    private volatile int currentCycle;
    private volatile int number;
    private volatile boolean isPrime;

    NumberProcessor(int cycles) {
        this.cycles = cycles;
    }

    public synchronized void run() {
        Scanner scanner = new Scanner(System.in);

        while (currentCycle < cycles) {
            if (Thread.currentThread().getName().equals("Thread-1")) {
                System.out.println("Enter a number: ");
                number = scanner.nextInt();
                currentCycle++;
                notify(); // Notify Thread-2 to check the number
                try {
                    wait(); // Wait for Thread-2 to finish processing
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else if (Thread.currentThread().getName().equals("Thread-2")) {
                while (currentCycle < cycles) {
                    try {
                        wait(); // Wait for Thread-1 to provide input
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    isPrime = checkPrime(number);
                    System.out.println(number + " " + isPrime);
                    currentCycle++;
                    notify(); // Notify Thread-1 that processing is done
                    break;
                }
            }
        }
        scanner.close();
    }

    private boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public int getNumber() {
        return number;
    }

    public boolean isPrime() {
        return isPrime;
    }
}

class Prime {
    public static void main(String[] args) {
        int cycles = 10;

        NumberProcessor numberProcessor = new NumberProcessor(cycles);

        Thread thread1 = new Thread(numberProcessor, "Thread-1");
        Thread thread2 = new Thread(numberProcessor, "Thread-2");

        thread1.start();
        thread2.start();

        
            
    }
}
