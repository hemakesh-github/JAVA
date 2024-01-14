import java.util.Arrays;
public class MergeSort {
    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return; // base case
        }

        int[] left = Arrays.copyOfRange(arr, 0, arr.length / 2);
        int[] right = Arrays.copyOfRange(arr, arr.length / 2, arr.length);

        mergeSort(left);
        mergeSort(right);

        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
        
      
    

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };

        mergeSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
