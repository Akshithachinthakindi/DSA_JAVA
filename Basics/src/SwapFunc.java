public class SwapFunc {
    public static void main(String[] args) {
//        int mm = SwapNums();
//        System.out.println();
        SwapNums();
    }
    static void SwapNums() {
        int a = 8;
        int b = 10;

        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
}

// ANOTHER PROGRAM FOR THE SAME

//import java.util.Scanner;
//
//public class   SwapNums {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        System.out.println("The entered numbers are: " + a + " " + b);
//        Numms(a, b);
////        System.out.println();
//    }
//    static void Numms(int a, int b){
//
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println("The swapped numbers are: " + a + " " + b);
////        System.out.println(b);
//    }
//}

//IN JAVA PASS BY REFERENCE DOESN'T WORK
//ONLY PASS BY VALUE WORKS
