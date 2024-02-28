package WorkingOnMultipleClasses;

import java.util.Scanner;

class c2 {
    Scanner in = new Scanner(System.in);
    int n;
    int[] arr;

    public c2() {
        System.out.print("Enter n: ");
        n = in.nextInt();
        System.out.print("Enter array elements: ");
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
    }

    static void RemoveEven(int[] arr, int n) {
       int oddCount = 0;
        for (int j : arr) {
            if (j % 2 != 0) {
                oddCount++;
            }
        }
        int[] result = new int[oddCount];
        int index = 0;
        for (int j : arr) {
            if (j % 2 != 0) {
                result[index] = j;
                index++;
            }
        }
        System.out.print("Array after removing even numbers: ");
        for (int j : result) {
            System.out.print(j + " ");
        }
    }
}

public class Class2 {
    public static void main(String[] args) {
        c2 NewClass = new c2();
        c2.RemoveEven(NewClass.arr, NewClass.n);
    }
}
