//reverse an array using stack
import java.util.Stack;
public class p8 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};

        Stack<Integer> stack = new Stack<>();
        for(int i =0;i<arr.length;i++){
            stack.push(arr[i]);
        }
        for(int i =0;i<arr.length;i++){
            arr[i] = stack.pop();
        }
        System.out.println("Reversed array is :");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
