package Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class ContainsDuplicate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter arr elements: ");
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print(myFunc(arr));
    }
    static boolean myFunc(int[] arr) {
        HashSet <Integer> myHash = new HashSet<>();
        for (int num : arr) {
            if (myHash.contains(num)) return true;
            myHash.add(num);
        }
        return false;
    }
}
