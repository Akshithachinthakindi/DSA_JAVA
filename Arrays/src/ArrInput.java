import java.util.Arrays;
import java.util.Scanner;

public class ArrInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print(Arrays.toString(arr));
    }
}
