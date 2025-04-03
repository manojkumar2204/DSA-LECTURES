//array rotation using reversal algorithm
public class p12 {
    public static void reverse(int arr[], int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int d = 2;
        d = d % arr.length; 
        reverse(arr, 0, d - 1);
        reverse(arr, d, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
        System.out.print("Rotated Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
