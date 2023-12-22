public class pattern4 {
    public static void main(String[] args) {
        int n = 5;
        mypattern4(n);
    }
    static void mypattern4(int n) {
        for (int i =0; i<n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *
