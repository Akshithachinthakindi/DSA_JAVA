package WorkingOnMultipleClasses;

import java.util.Scanner;

class c1 {
    Scanner sc = new Scanner(System.in);
    int n;
    int[] arr;

    public c1() {
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {   // taking an input array in a constructor
            arr[i] = sc.nextInt();
        }
    }

    public static void PrintingArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
}


public class class1 {
    public static void main(String[] args) {
        c1 newClass = new c1();
        c1.PrintingArray(newClass.arr, newClass.n);
    }
}