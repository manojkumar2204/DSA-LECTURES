//array rotation using a temporary array
public class p10 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6}; 
        int d = 2;
        int temp[] = new int[arr.length];
        for (int i = 0; i < arr.length - d; i++) {
            temp[i] = arr[i + d];
        }
        for(int i = 0; i < d; i++) {
            temp[arr.length - d + i] = arr[i];
        }
        System.out.print("Rotated Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
