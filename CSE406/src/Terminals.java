import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public interface Terminals {

    /**
     * @param args
     */
    public static void main(String[] args) {
        List<String> list = Arrays.asList("car","bike","bus","bike","car","bus");
        List<String> collect = list.stream().distinct().collect(Collectors.toList());

        System.out.println(collect);

        list.stream().distinct().forEach(System.out::println);

        long count = list.stream().count();
        long distinctCount = list.stream().distinct().count();
        System.out.println("Count: "+count);
        System.out.println("Distinct Count: "+distinctCount);

        list.stream().limit(2).forEach(System.out::println);
        List<String> collect2 = list.stream().limit(3).collect(Collectors.toList());
        System.out.println(collect2);


        List<Integer> list1 = Arrays.asList(2,3,8,6,4,2,8,6,7,3,9);
        long t = list1.stream().filter(e->e%2==0).count();
        System.out.println("Number of even elements: "+t);

        Optional<Integer> m = list1.stream().min((a, b)->a.compareTo(b));
        System.out.println("Min: "+m.get());

        Optional<Integer> m2 = list1.stream().max((a,b)->a.compareTo(b));
        System.out.println("Max: "+m2.get());
        List<String> myList = Arrays.asList("1","2","3","4","5","A","B");
        Optional<String> red = myList.stream().reduce(
                (val, comb)-> {
                    return val+comb;
                });
        System.out.println(red);
        Object a[] = myList.stream().toArray();
        System.out.println("Length of the list is: " + a.length);
        for (Object x: a) {
            System.out.println("Elements of the list are: "+x);
        }
    }
}