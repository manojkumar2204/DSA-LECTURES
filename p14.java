//insertion ellement at first position
import java.util.*;
public class p14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements:");
        int n = sc.nextInt();

        int arr[] = new int[n +1];

        System.out.print("Enter" + n +" Elements:");
        for(int i = 0;i<n ; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the element to be inserted:");
        int insert = sc.nextInt(); 
        for(int i =n;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = insert;
        n ++;
        for(int i = 0;i<n; i++){
            System.out.println(arr[i] +" ");
        }
        sc.close();
    } 
}