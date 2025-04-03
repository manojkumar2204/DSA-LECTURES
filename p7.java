//reverse an array using recursion
public class p7 {
    public static void recursiveArray(int[] arr,int start,int end){
        if(start >= end){
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        recursiveArray(arr,start +1,end -1);

    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,9};
        int n = arr.length;

        System.out.println("Array before reverse :");
        for(int i =0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        recursiveArray(arr,0,n-1);

        System.out.println("Array after reverse :");
        for(int i =0;i< n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
