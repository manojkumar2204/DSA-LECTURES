//program to find the total time execution of sum of n natural number for O(1)

public class p3 {
    public static int findSum(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        int n = 14;
        long startTime = System.nanoTime();

        findSum(n);
        long endTime = System.nanoTime();
        double timeTaken = (endTime - startTime) / 1000000000.0;

        System.out.println("findSum(n) took " + timeTaken + " seconds to execute.");
    }
}
