//Array Reverse Using an Extra Array (Non In-place)

public class p4 {
    public static void reverseArrayUsingExtraArray(int[] originalArr) {
        int size = originalArr.length;
        int[] reversedArr = new int[size]; 
        for (int i = 0; i < size; i++) {
            reversedArr[i] = originalArr[size - i - 1];
        }
        System.out.print("Reversed Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(reversedArr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] originalArr = {1, 2, 3, 4, 5}; 
        reverseArrayUsingExtraArray(originalArr); 
    }
}
