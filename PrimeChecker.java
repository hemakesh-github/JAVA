import java.util.Scanner;
class Thread1 implements Runnable{
    Thread t;
    Thread1() {
        t = new Thread(this);
        t.start();
    }
    public void run() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i< 10; i++) {
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            Thread2 ob = new Thread2(n);
            try {
                ob.t1.join();
            }
            catch(InterruptedException ie) {
                System.out.println(ie);
            }
            
        }
        sc.close();
    }
}

class Thread2 implements Runnable{
    int n;
    Thread t1;
    Thread2(int n) {
        this.n = n;
        t1 = new Thread(this);
        t1.start();
    }
    public void run() {
        boolean isPrime = true;
        if (n <= 1) {
            isPrime = false;
        }
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(n + " PRIME");
        } 
        else {
            System.out.println(n + " NOT PRIME");
        }
        
    }
    
}

class PrimeChecker {
    public static void main(String args[]) {
        Thread1 ob = new Thread1();
        
        try {
            ob.t.join();
        }
        catch(InterruptedException ie) {
            System.out.println(ie);
        }
        System.out.println("main thread exiting...");
    }
}