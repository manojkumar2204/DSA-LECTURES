//a java program to calculate the time taken by a function
import java.util.*;

public class p1 {
    public static void function() {
        Scanner sc = new Scanner(System.in);
        System.out.println("function starts");
        System.out.println("Press Enter to stop fun...");
        
        sc.nextLine(); 
        System.out.println("function ends");
        sc.close();
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        function(); 
        long endTime = System.currentTimeMillis();
        double timeTaken = (endTime - startTime) / 1000.0;
        System.out.println("function took " + timeTaken + " seconds to execute.");
    }
}
