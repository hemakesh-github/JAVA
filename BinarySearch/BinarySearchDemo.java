class BinarySearch {
    int low;
    int high;
    double key;
    int mid;
    int[] intArray;
    double[] doubleArray;
    BinarySearch(int arr[]) {
        intArray = new int[arr.length];
        low = 0;
        high = arr.length - 1;
        System.arraycopy(arr, 0, intArray, 0, arr.length);
    }

    BinarySearch(double arr[]) {
        doubleArray = new double[arr.length];
        low = 0;
        high = arr.length - 1;
        System.arraycopy(arr, 0, doubleArray, 0, arr.length);
    }

    int DoBinarySearch(double k) {
        key = k;
       
        while (low <= high) {
            mid = (low + high)/2;
            if (intArray != null) {
                if (key == intArray[mid]) {
                    return mid;
                }
                else if (key > intArray[mid]) {
                    low = mid + 1;
                }
                else {
                    high = mid -1;
                }
            }
            else if (doubleArray != null) {
                if (key == doubleArray[mid]) {
                    return mid;
                }
                else if (key > doubleArray[mid]) {
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
    public static void main(String arga[]) {
        int sorted_arr1[] = {2, 4, 6, 8};
        double sorted_arr2[] = {2.2, 3.4, 4.5, 6.9};

        BinarySearch arr1 = new BinarySearch(sorted_arr1);
        BinarySearch arr2 = new BinarySearch(sorted_arr2);

        int index1 = arr1.DoBinarySearch(2);
        if (index1 != -1) {
            System.out.println(index1);
        }
        else {
            System.out.println("Element not found");
        }
        int index2 = arr2.DoBinarySearch(4.5);
        if (index2 != -1) {
            System.out.println(index2);
        }
        else {
            System.out.println("Element not found");
        }
    }  
}


