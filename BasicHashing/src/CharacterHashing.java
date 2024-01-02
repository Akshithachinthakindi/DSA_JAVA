import java.util.Scanner;

public class CharacterHashing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        taking the string input
        System.out.print("Enter the string: ");
        String s = in.next();


//       typecasting : string --- to --- ascii value and stored in the hashArray
        int[] hashArr = new int[256];
        for (int i = 0; i < s.length(); i++) {
            hashArr[s.charAt(i)] += 1;
        }

//      taking the query size
        System.out.print("Enter the size of the query: ");
        int q = in.nextInt();

//        taking the char input and fetching the frequency of the char in the array
        while (q-- != 0) {
            char c = in.next().charAt(0);
            System.out.println(c+ " repeated " +hashArr[c] + " times");
        }
    }
}
