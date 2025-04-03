//binary search for sorted array
public class p18 {
    public static int binarySearch(int arr[], int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2; 
            if (arr[mid] == key) {
                return mid; 
            }
            if (arr[mid] < key) {
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 7, 8, 9, 10 }; 
        int key = 10; 
        int index = binarySearch(arr, key);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
