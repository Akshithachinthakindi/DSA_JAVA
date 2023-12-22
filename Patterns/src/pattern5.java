public class pattern5 {
    public static void main(String[] args) {
        int n = 5;
        mypattern5(n);
    }
    static void mypattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
//System.out.print(n-j + 1 + " ");       System.out.print(j + " ");
//1 2 3 4 5                              5 4 3 2 1
//1 2 3 4                                5 4 3 2
//1 2 3                                  5 4 3
//1 2                                    5 4
//1                                      5


