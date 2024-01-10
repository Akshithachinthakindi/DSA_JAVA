public class SmallestArrElement {
    public static void main(String[] args) {
        int[] arr1 = {8754,87,14,587,22,3,154,1,585};
        int[] arr2 = {45,587,14,54,12,12,22,3,7};

        System.out.println("The smallest in arr1 is: " + myfunc(arr1));
        System.out.println("The smallest in arr2 is: " + myfunc(arr2));
    }
    static int myfunc(int[] arr) {
        int min = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
}

// tc : O(N)
// sc : O(1)
