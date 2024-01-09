import java.util.Scanner;

public class StudentsMarksListUpdate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        System.out.print("Enter k: ");
        int k = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < k; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            System.out.println(func(x,y,arr));
        }
    }

    static String func(int x, int y, int[] arr) {
        arr[x-1] = y;
        int ans = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]) {
                ans += 1;
            }
        }
        return "Number of students part of merit list are:" + ans;
    }
}