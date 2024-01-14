public class BinarySearch {
    private int[] array;

    public BinarySearch(int[] array) {
        this.array = array;
    }

    public int search(int target) {
        int left = 0;
        int right = array.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                result = mid;
                right = mid - 1; // Update right to search for the first occurrence
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}
public class MainClass {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};
        int target = 5;

        BinarySearch binarySearch = new BinarySearch(array);
        int result = binarySearch.search(target);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
