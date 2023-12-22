import java.util.Arrays;
    public class ChangingArrValues {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4,5,6};
            int[] arr1 = {1, 3, 5, 6,7, 88, 99};
            change(arr);
            change(arr1);
            System.out.println(Arrays.toString(arr));
            System.out.println(Arrays.toString(arr1));
        }
        static void change(int[] nums) {
            nums[0] = 0;
            nums[1] = 1;
        }
    }
