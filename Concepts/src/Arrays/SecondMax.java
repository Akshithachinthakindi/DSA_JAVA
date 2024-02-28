package Arrays;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = {18,54,21,16,23};

        int max = Integer.MIN_VALUE;
        int SecMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                SecMax = max;
                max = arr[i];
            }
            else if(arr[i] > SecMax && arr[i] != max) {
                SecMax = arr[i];
            }
        }
        System.out.println(SecMax);
    }
}
