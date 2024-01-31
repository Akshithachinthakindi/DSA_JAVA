import java.util.Scanner;

public class RemoveSpace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = in.nextLine();
        System.out.print(myFunc(str));
    }
    public static String myFunc(String str) {
        str = str.replaceAll(" ", "");
        return str;
    }
}
