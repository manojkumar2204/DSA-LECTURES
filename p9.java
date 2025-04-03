//rotate an array by 2 left position(d = 2)
public class p9 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int d = 2; 
        for (int i = 1; i <= d; i++) {
            int first = arr[0]; 
            for (int j = 0; j< arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length- 1] = first;
        }
        System.out.println("Rotated Array:");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
