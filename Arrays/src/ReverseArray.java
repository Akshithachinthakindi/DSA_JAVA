import java.util.Arrays;
import java.util.Scanner;


//TWO POINTER METHOD USED
public class ReverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of an arr: ");
        int n = in.nextInt();
        System.out.print("Enter array elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        reverse(arr);
        System.out.print(Arrays.toString(arr));

    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
