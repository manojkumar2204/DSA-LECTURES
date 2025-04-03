//reverse an array using loop (two pointers start and end)

public class p5 {
    public static void reversedArray(int[] arr,int start,int end){
        int temp;
        while(start < end ){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;

        }
    }
    public static void printArray(int[] arr,int n){
        for(int i =0;i< n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] ={2,3,4,5,7,8};
        int n = arr.length;
        System.out.println("Array before reverse :");
        printArray(arr,n);
        reversedArray(arr,0,n-1);
        System.out.println("Reversed Array is :");
        printArray(arr,n);

    }
}
