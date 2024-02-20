package Practice;

import java.util.ArrayList;

public class p3 {
    public static void main(String[] args) {


        // string concatenation operators


        System.out.println('a'+'b');  // prints ascii val of a and b 195
        System.out.println("a"+"b");  // prints ab
        System.out.println('a'+3); // prints 100
        System.out.println((char)('a'+3)); // prints d, since.. ,a=97,b=98,c=99,d=100
        System.out.println("a"+1);  // prints a1
        System.out.println("akshitha"+new ArrayList<>()); // akshitha[]
        System.out.println("akshitha"+ Integer.valueOf(22));  //akshitha22

//        System.out.println("akshitha"+new Integer(22));  // old syntax and has been removed in updated versions so use the one @line18
//        System.out.println(Integer.valueOf(22) + new ArrayList<>()); // this gives an error cuz one string must be present to use "+" operator
        System.out.println(Integer.valueOf(22) + "" + new ArrayList<>());  // this will work

        // in java operator overloading is not possible without using string


    }
}
