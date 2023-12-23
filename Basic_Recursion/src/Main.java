public class Main {
    static int count = 0;
    static void func() {
        if (count != 3) {
            System.out.println(count);
            count++;
            func();
        }
        return;
    }
    public static void main(String[] args) {
        func();
    }
}