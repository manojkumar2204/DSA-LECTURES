//deletion operation 
public class p17 {
    public static int findElement(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; 
            }
        }
        return -1; 
    }
    public static int[] deleteElement(int arr[], int key) {
        int index = findElement(arr, key);
        if (index == -1) {
            System.out.println("Element not found");
            return arr; 
        }
        
        int newArr[] = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j++] = arr[i]; 
            }
        }
        return newArr; 
    }

    public static void main(String[] args) {
        int arr[] = {10, 50, 30, 40, 20};
        int key = 30;

        System.out.println("Array before deletion:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        arr = deleteElement(arr, key); 
        System.out.println("\nArray after deletion:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
