import java.util.Scanner;
import java.util.Stack;

public class ArrNearestSmall {
    public static void main(String[] args) {
//        this is a program where we have to print the smallest nearer number of the current element in the array
//        for example : arr = { 1,6,4,10,2,5}  --> output : {-1,1,1,4,1,2}

        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        System.out.print("Enter arr elements: ");  //arr input
        int[] inputArr = new int[n];
        for (int i = 0; i < n; i++) {
            inputArr[i] = in.nextInt();
        }
        int[] outputArr = new int[n];  // arr output

        Stack <Integer> myStack = new Stack<>();

        myStack.push(inputArr[0]);  // pushing first input ele to the stack
        outputArr[0] = -1;   // the first element of output arr is always -1

        for (int i = 1; i < n; i++) {  // iterating from 2nd element to last
            while (myStack.size() > 0 && myStack.peek() >= inputArr[i]){
      // until the stack gets empty and if top element in stack is greater than current input element it will pop
                myStack.pop();
            }
            if (myStack.size() == 0) {  // if the current element has nothing in stack then by default it is -1
                outputArr[i] = -1;
            } else {
                outputArr[i] = myStack.peek();  // or if the current element has its smallest num in stack it is considered in op
            }
            myStack.push(inputArr[i]); // pushing the current element to stack to check for next element
        }

        for (int i = 0; i < n; i++) {
            System.out.print(outputArr[i] + " ");  // printing output
        }
    }
}
