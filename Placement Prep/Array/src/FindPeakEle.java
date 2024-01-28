public class FindPeakEle {
    public static void main(String[] args) {
        int[] nums = {2, 1};
        System.out.print(findPeakElement(nums));
    }
    public static int findPeakElement(int[] nums) {
        if(nums.length == 1) {
            return 0;
        }
        int max = nums[0];
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] >= max) {
                max = i;
            }
        }
        return max;
    }
}