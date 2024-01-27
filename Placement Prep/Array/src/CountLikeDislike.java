public class CountLikeDislike {

//    HackerEarth practice ques for Quantiphi
    public static void main(String[] args) {
        String A = "101001";
        String P = "010001";

        System.out.print(myFunc(A, P));
    }
    public static int myFunc(String A, String P) {
        int count = 0;
        for (int i = 0; i < A.length(); i++) {
            char Alikesdislikes = A.charAt(i);
            char Plikesdislikes = P.charAt(i);
            if (Alikesdislikes == Plikesdislikes) {
                count++;
            }
        }
        return count;
    }
}
