//find the sum of n natural numbers
import java.util.*;
public class p2 {
    public static int sumOfNaturalnumber(int n){
        int sum =0;
        for(int i =1;i<=n;i++){
            sum += i;
        }
        System.out.println("Total sum is :" + sum);
        return sum;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        long startTime = System.nanoTime();
        sumOfNaturalnumber(n);
        long endTime = System.nanoTime();

        double timeTaken = (endTime - startTime) /  1000000000.0; 
        System.out.println("Execution time: " + timeTaken + " seconds");
        sc.close();
    }
}
