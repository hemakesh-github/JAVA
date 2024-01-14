class Q{
    int n;
    boolean valueSet = false;
    public synchronized void put(int n) {
        if(valueSet){
            try {
                wait();
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("put: "+ n);
        this.n = n;
        valueSet = true;
        notify();
    }

    public synchronized void get(){
        if(!valueSet){
            try{
                wait();
            } catch(Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("get: "+ n);
        valueSet = false;
        notify();
    }
}

class Producer implements Runnable{
    Q q;
    Producer(Q q) {
        Thread p = new Thread(this, "Producer");
        this.q = q;
        p.start();
    }

    public void run(){
        int i = 0;
        while(true){
            q.put(i++);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Consumer implements Runnable{
    Q q;
    Consumer(Q q) {
        this.q = q;
        Thread c = new Thread(this, "Consumer");
        c.start();
    }
    public void run(){
        while(true){
            q.get();
        }
    }
}

class Main{
    public static void main(String args[]){
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
    } 
}