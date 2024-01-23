import java.util.Scanner;
import java.util.stream.*;
import java.util.ArrayList;

public class MtStream{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = in.nextInt();
        }

        ArrayList <Integer> MyList = new ArrayList<>();

        for (int i : arr) {
            MyList.add(i);
        }
        System.out.print(MyList);

        Stream <Integer> MyStream = MyList.stream();

//        MyStream.forEach(x ->System.out.println(x));
        MyStream = MyStream.distinct().sorted();
        System.out.println();
        System.out.println("Array after sorted and distinct");
        MyStream.forEach(x->System.out.println(x));


    }
}