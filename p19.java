//inserted in a sorted array
public class p19{
    public static int insertSorted(int arr[], int n, int key) {
        int i;
        for (i = n - 1; i >= 0 && arr[i] > key; i--) {
            arr[i + 1] = arr[i]; 
        }
        arr[i + 1] = key;
        return n + 1; 
    }

    public static void main(String[] args) {
        int arr[] = new int[20]; 
        int n = 6; 
        int key = 26;
        int temp[] = { 12, 16, 20, 40, 50, 70 };
        System.arraycopy(temp, 0, arr, 0, n); 
        System.out.print("Before Insertion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        n = insertSorted(arr, n, key);

        System.out.print("\nAfter Insertion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
