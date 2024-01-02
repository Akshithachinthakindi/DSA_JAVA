import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

//        this is a program to study hashing by counting the occurrence of each number in the array by creating a hash array
        Scanner in = new Scanner(System.in);

//        enter the size of an array
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();

//        enter the array elements
        System.out.print("Enter the array elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

//        creating a hash array of size 13
        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] = hash[arr[i]] + 1;      // here we are counting the occurrence of each num in the array
        }  //hash arr is ready now

//        enter the query size
        System.out.print("Enter the query size: ");
        int q = in.nextInt();
//        take input queries to search for the occurrence numbers in hash array
        while (q-- != 0) {
            int nums = in.nextInt();
//            fetching the frequency of arr elements
            System.out.println(hash[nums]);
        }
    }
}