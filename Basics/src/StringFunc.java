import java.util.Scanner;

public class StringFunc {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = in.next();

//        hello();
        String wish = myfunc(name);
        System.out.print(wish);
    }
    //    static String hello() {
//        String Mwish = "Hey there! G'mornin";
//        System.out.println(Mwish);
//        return Mwish;
//    }
    static String myfunc(String name) {
        String mymsg = "Happy Birthday " + name;
        return mymsg;
    }
}
