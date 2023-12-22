import java.util.Arrays;
import java.util.Scanner;

public class ArrStr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("enter string: ");
        String[] arr = new String[5];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = in.next();
        }
        System.out.print("entered string is: " + Arrays.toString(arr));
    }
}
