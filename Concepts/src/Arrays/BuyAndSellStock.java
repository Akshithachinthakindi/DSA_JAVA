package Arrays;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] arr = {7, 1, 3, 5, 7, 6};
        System.out.println("The maximum profit after buying and selling sales is: " + myFunc(arr));
    }
    static int myFunc(int[] arr) {
        int buyTime = arr[0];
        int profit = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < buyTime) {
                buyTime = arr[i];
            } else {
                int curProfit = arr[i] - buyTime;
                profit = Math.max(curProfit, profit);
            }
        }
        return profit;
    }
}
