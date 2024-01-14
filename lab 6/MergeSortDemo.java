import java.util.Scanner;
class MergeSort {
    int interchanges;
    void divide(int arr[], int si, int ei) {//code to divide the array
        if(si >= ei) {
            return;
        }
        //finding the mid value
        int mid = (si + ei)/2;
        divide(arr, si, mid);//recursively calling divide method till length of array is 1
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);//calling conquer method to merge the sorted arrays
    }

    void conquer(int arr[], int si, int mid, int ei) {//code to merge the sorted arrays
        int[] merged = new int[ei - si + 1];
        int i1 = si;
        int i2 = mid+1;
        int x = 0;
        
        while (i1 <= mid && i2 <= ei) {
            if(arr[i1] <= arr[i2]) {
                merged[x++] = arr[i1++];
            } else {
                merged[x++] = arr[i2++];
                interchanges++;
            }
        }

        while(i1 <= mid) {
            merged[x++] = arr[i1++];
        }

        while(i2 <= ei) {
            merged[x++] = arr[i2++];
        }

        //copying sorted elements to original array
        for(int i = 0 ,j = si; i < merged.length ; i++, j++) {
            arr[j] = merged[i];
        }
    }

    void doMergeSort(int[] arr) {
        int si = 0;
        int ei = arr.length - 1;
        divide(arr, si, ei);
    }

   int getInterchanges() {
        return interchanges;
   }
    
}



class MergeSortDemo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //geting size of array from user
        System.out.print("Enter total number of elements: ");
        //creating an object of Scanner class
        int n = sc.nextInt();
        int[] arr = new int[n];
        //getting elements from user
        System.out.println("Enter the elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //creating an object ob1 of MergeSort class
        MergeSort ob1 = new MergeSort();
        ob1.doMergeSort(arr);
        //dsplaying elements of sorted array
        System.out.println("Elements of sorted array: ");
        for(int i = 0; i< n; i++){
            System.out.println(arr[i]);
        }

        //printing no. of interchanges
        System.out.println("Number of interchanges = " + ob1.getInterchanges());
        //closing Scanner class object
        sc.close();
    }
}