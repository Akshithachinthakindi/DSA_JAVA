<<<<<<< HEAD
import java.util.Scanner;

public class BuyAndSellStock {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        System.out.print("Enter arr elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("The maximum profit after buying and selling stocks is: " + myFunc(arr, n));

    }
    static int myFunc(int[] arr, int n) {
        int buy_time = arr[0];
        int profit = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < buy_time) {
                buy_time = arr[i];
            } else {
                int curProfit = arr[i] - buy_time;
                profit = Math.max(curProfit, profit);
            }
        }
        return profit;
    }
}
=======
import java.util.Scanner;

public class BuyAndSellStock {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
    }
}
>>>>>>> origin/master
