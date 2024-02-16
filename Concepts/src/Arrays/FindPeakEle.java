package Arrays;

public class FindPeakEle {
    public static void main(String[] args) {
        int[] nums = {2, 1};
        System.out.print(findPeakElement(nums));
    }
    public static int findPeakElement(int[] nums) {
        if(nums.length == 1) {
            return 0;
        }
        int max = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] >= max) {
                return max;
            }
        }
        return 0;
    }
}