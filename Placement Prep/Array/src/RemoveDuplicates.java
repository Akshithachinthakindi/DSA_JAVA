import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        //    remove duplicates from a sorted array and return the length of an array
        int[] arr = {1,1,1,2,2,3,3,3,4,4,5};
        HashSet<Integer> myHash = new HashSet<>();
        for(int j = 0; j < arr.length; j++) {
            if (myHash.contains(arr[j])) {
                myHash.remove(arr[j]);
            }
            myHash.add(arr[j]);
        }
        System.out.print("length of the array is: "+myHash.size() + " and the array elements are: " + myHash);
    }
}
