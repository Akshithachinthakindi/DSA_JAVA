package Arrays;

public class FindMissingNum {
    public static void main(String[] args) {
        int[] arr = {7,5,3,1,6,2};
        System.out.println(FindMissingNumber(arr));
    }
    public static int FindMissingNumber(int[] arr) {
        int n = arr.length+1;

        int sum = n * (n+1) / 2;
        for (int num : arr) {
            sum = sum - num;
        }
        return sum;
    }
}
