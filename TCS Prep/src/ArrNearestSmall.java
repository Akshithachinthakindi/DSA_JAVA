import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ArrNearestSmall {
    public static void main(String[] args) {
//        this is a program where we have to print the smallest nearer number of the current element in the array
//        for example : arr = { 1,6,4,10,2,5}  --> output : {-1,1,1,4,1,2}
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        System.out.print("Enter array elements: ");
        int[] InputArr = new int[n];
        for (int i = 0; i < n; i++) {
            InputArr[i] = in.nextInt();
        }

        int[] OutputArr = new int[n];

        Stack <Integer> myStack = new Stack<>();

        myStack.push(InputArr[0]);
        OutputArr[0] = -1;

        for (int i = 1; i < n; i++) {
            while (myStack.size() > 0 && myStack.peek() >= InputArr[i]) {
                myStack.pop();
            }
            if (myStack.size() == 0) {
                OutputArr[i] = -1;
            } else {
                OutputArr[i] = myStack.peek();
            }

            myStack.push(InputArr[i]);
        }

        System.out.println("Output Array is: " + Arrays.toString(OutputArr));
    }
}
