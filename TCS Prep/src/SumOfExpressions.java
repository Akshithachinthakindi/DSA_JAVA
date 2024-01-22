public class SumOfExpressions {
    static final int MOD = 1000000007;

    // Helper function to calculate the value of an expression
    private static int calculateExpression(String expression) {
        String[] parts = expression.split("\\+");
        int sum = 0;
        for (String part : parts) {
            sum = (sum + Integer.parseInt(part)) % MOD;
        }
        return sum;
    }

    // Function to find the sum of all possible expressions modulo (10^9 + 7)
    private static int findSumOfExpressions(String num) {
        int n = num.length();
        int totalSum = 0;

        // Iterate through all possible positions to insert '+'
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String subStr = num.substring(i, j);
                totalSum = (totalSum + calculateExpression(subStr)) % MOD;
            }
        }

        return totalSum;
    }

    // Example usage
    public static void main(String[] args) {
        String num = "123";
        int result = findSumOfExpressions(num);
        System.out.println(result);
    }
}
