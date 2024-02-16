package Arrays;

public class FindTargetInSortedArr {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,3,4,5,6,7,8,9};
        int target = 6;
        System.out.println(myFunc(arr, target));
    }
    public static int myFunc(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
