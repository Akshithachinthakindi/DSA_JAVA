package Arrays;

public class MinArr {
    public static void main(String[] args) {
        int[] arr1 = {5,6,7,9,2,12,15};
        int[] arr2 = {4,9,8,6,1,0};

        MinimumArrNum(arr1);
        MinimumArrNum(arr2);

    }
    public static void MinimumArrNum(int[] arr){
        int min = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        System.out.println(min);
    }
}