public class Shadowing {
    //    initializing a static int in the main func
//    & it can be accessed anywhere in the whole func

    static int x = 22; // this will be shadowed at line 10

    public static void main(String[] args) {

        int x = 28;
//        here we r again re-initializing the x and this time 28 will get printed bcuz the x in this func overlaps the x in main func
        System.out.println(x);
//        here we are printing the x that we initialized outside the func
        example();
    }
    static void example() {
        System.out.println(x);
//        here we r again printing x in a diff func which again is not giving any error

    }
}
