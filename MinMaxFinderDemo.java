class MinMaxFinderDemo{
    public static void main(String[] args) {
        int[] a = {1, 5, 9, 100};
        new FindMin(a);
        new FindMax(a);
    }
}

class FindMin implements Runnable{
    int[] a;
    FindMin(int[] arr) {
        this.a = arr;
        new Thread(this).start();
    }

    public synchronized void run() {
        int min = a[0];
        for(int i = 1; i < a.length; i++) {
            if(a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Min : "+min);
    }

}

class FindMax implements Runnable{
    int[] array;
    FindMax(int[] a) {
        this.array = a;
        new Thread(this).start();;
    }

    public synchronized void run() {
        int max = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max: " + max);
    }
}