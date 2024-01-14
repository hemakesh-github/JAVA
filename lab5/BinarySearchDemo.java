import java.util.Scanner;

class BinarySearch {
    int low;
    int high;
    double key;
    int mid;
    int[] Array;
    BinarySearch(int arr[]) {
        Array = new int[arr.length];
        low = 0;
        high = arr.length - 1;
        System.arraycopy(arr, 0, Array, 0, arr.length);
    }

   

    int DoBinarySearch(int k) {
        key = k;
        while (low <= high) {
            mid = (low + high)/2;
            if (Array != null) {
                if (key == Array[mid]) {
                    return mid;
                }
                else if (key > Array[mid]) {
                    low = mid + 1;
                }
                else {
                    high = mid -1;
                }
            }
        }
        return -1;
    }

}

public class BinarySearchDemo {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scan.nextInt();
        int sorted_arr[] = new int[n];
        System.out.println("Enter elements: ");
        for(int i = 0; i < n; i++) {
            sorted_arr[i] = scan.nextInt();
        }
        System.out.print("Enter element to search: ");
        int key = scan.nextInt();
        BinarySearch arr = new BinarySearch(sorted_arr);
        int index1 = arr.DoBinarySearch(key);
        if (index1 != -1) {
            System.out.println(index1);
        }
        else {
            System.out.println("Element not found");
        }
        scan.close();
    }  
}



