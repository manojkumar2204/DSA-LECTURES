//deletion a element in a sorted array
public class p20{
    public static int deleteElement(int arr[], int n, int key) {
        int pos = binarySearch(arr, 0, n - 1, key); 
        if (pos == -1) {
            System.out.println("Element not found");
            return n;
        }
        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        return n - 1; 
    }
    public static int binarySearch(int arr[], int low, int high, int key) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1; 
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int n = arr.length;
        int key = 30;

        System.out.print("Before Deletion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        
        n = deleteElement(arr, n, key);

        System.out.print("\nAfter Deletion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
