import java.util.*;
import java.util.stream.Collectors;

public class MyMapStream {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> myList = Arrays.asList(1,5,4,7,8);
        List<Integer> square = myList.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(myList);
        System.out.println(square);
    }
}
