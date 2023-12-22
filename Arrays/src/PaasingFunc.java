import java.util.Arrays;
import java.util.Scanner;

public class PaasingFunc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] nums = {1, 2,3 ,4,5};
        System.out.println(Arrays.toString(nums));
        hello(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void hello(int[] lol) {
        lol[2] = 22;
    }
}
