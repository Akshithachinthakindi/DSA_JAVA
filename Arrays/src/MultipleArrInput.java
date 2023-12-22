import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MultipleArrInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5},
//                {6, 7, 8, 9},
//        };
        int[][] arr = new int[3][4];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
//                System.out.println(arr[row][col] + " ");
            }
        }
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
//            for (int col = 0; col < arr[row].length; col++) {
////                arr[row][col] = in.nextInt();
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
        }
    }
}
