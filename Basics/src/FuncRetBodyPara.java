import java.util.Scanner;

public class FuncRetBodyPara { // function return body parameters
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        String op = Wish(name);
        System.out.print(op);
    }
    static String Wish(String name) {
        String str = "Hello "+name+", Nice to meet you!";
        return str;
    }
}

