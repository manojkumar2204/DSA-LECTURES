//insert at any position
import java.util.*;
public class p16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Elements:");
        int n = sc.nextInt();
        int arr[] = new int[n +1];
        System.out.print("Enter array elements:");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the position(0 to " + n +"): ");
        int position = sc.nextInt();

        if(position <0 || position >n){
            System.out.println("invalid position");
            return;
        }

        System.out.println("Enter the element to be insert");
        int insert = sc.nextInt();

        for(int i =n;i>position;i--){
            arr[i] = arr[i - 1];
        }

        arr[position] = insert;
        n++;

        System.out.println("Elements of array after inseertion:");
        for(int i = 0;i<n;i++){
            System.out.println(arr[i] +" ");
        }
        sc.close();
    }
}