import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        boolean ans = IsPrime(num);
        System.out.println(ans);
    }
    static boolean IsPrime(int num) {
        if(num <= 1)
            return false;
        int c = 2;
        while(c*c <= num) {
            if(num % c == 0) {
                return false;
            }
            c++;
        }
        return c*c > num;
    }
}
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = in.nextInt();
////        boolean ans = IsArmstrong(num);
////        System.out.println(ans);
//        System.out.println(IsArmstrong(num));
//
//        for(int i = 100; i < 1000; i++) {
//            if(IsArmstrong(i)){
//                System.out.println(i);
//            }
//        }
//    }
//    static boolean IsArmstrong(int num) {
//        int org = num;
//        int sum = 0;
//        while(num > 0) {
//            int rem = num%10;
//            num /= 10;
//            sum += rem*rem*rem;
//        }
//        return sum == org;
//    }