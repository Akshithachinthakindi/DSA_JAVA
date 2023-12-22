import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(10);
//        there are 2 ways to add the nums to the list
//        1st way
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(23);

//        2nd way
        System.out.print("Enter the nums to list: ");
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
            // 2nd way to print a list
        }
//        System.out.print();
        System.out.print(list); // 1st way to print a list
    }
}
