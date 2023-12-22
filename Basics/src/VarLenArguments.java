import java.util.Arrays;

public class VarLenArguments {
    public static void main(String[] args) {
        hehe("Satyanarayana Chinthakindi", "Srivani Chinthakindi", "Akshitha Chinthakindi","Sathwika Chinthakindi");

        multiple(42, 38, 20, 18, "Stayanarayana", "SriVani", "Akshitha", "Sathwika");
    }
    static void hehe(String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int age1,int age2, int age3, int age4, String ...v){
        System.out.println(Arrays.toString(v));

    }
}
