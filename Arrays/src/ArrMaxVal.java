import java.util.Arrays;
import java.util.Scanner;

public class ArrMaxVal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[8];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i< arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Max Value of the Array is: "+ maxRange(arr, 1, 5));
    }
    static int maxRange(int[] arr, int start, int end) {
        int max = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
//    static int maxVal(int[] arr){
//        int max = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        return max;
//    }
}
