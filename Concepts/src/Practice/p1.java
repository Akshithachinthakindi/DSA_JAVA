package Practice;

import java.util.Objects;
import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String name2 = sc.nextLine();
//        char[] charname = name.toCharArray();
//        char[] cname2 = name2.toCharArray();
//        System.out.println(charname);
//        System.out.println(cname2);
//        System.out.println(Objects.equals(charname, cname2));
//        System.out.println(Objects.equals(name, name2));  // true
//        System.out.println(name==name2);  // op - false
//        String a = "akshitha";
//        String b = "akshitha";
//        System.out.println(a==b);
        System.out.println(name.equals(name2));
        System.out.println(Objects.equals(name, name2));
//        above both are doing the same thing, just different way of coding
        System.out.println(name.charAt(0));  // to access each char through index

    }
}
