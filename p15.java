//insert at the end 
import java.util.*;
public class p15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements :");
        int n = sc.nextInt();
        int arr[] = new int[n +1];
        System.out.print("Enter " + n + " elements : ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element which is to insert in the last position:");
        int insert = sc.nextInt();
        arr[n] = insert;
        n++; 
        System.out.println("Elements after insert :");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
        sc.close();
    }
}

