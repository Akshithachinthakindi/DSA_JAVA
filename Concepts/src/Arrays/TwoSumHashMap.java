package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSumHashMap {

    //    more efficient code
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array elements: ");
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the target number: ");
        int target = in.nextInt();
        System.out.println(Arrays.toString(myFunc(arr, target)));
    }
    static int[] myFunc(int[] arr, int t) {
        HashMap<Integer, Integer> myHashNum = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int compliment = t - arr[i];
            if (myHashNum.containsKey(compliment)) {
                return new int[]{myHashNum.get(compliment), i};
            }
            myHashNum.put(arr[i], i);
        }
        return new int[]{-1, -1};  // if no target found
    }
}

