import java.util.ArrayList;
import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1,2,0,3,0,0,4,5};
        ArrayList<Integer> tempArr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                tempArr.add(arr[i]);
            }
        }
        for (int i = 0; i < tempArr.size(); i++) {
            arr[i] = tempArr.get(i);
        }
        for (int i = tempArr.size(); i < arr.length; i++) {
            arr[i] = 0;
        }
        System.out.print(Arrays.toString(arr));
    }
//    public static int[] myFunc(int[] arr) {

//        1ST METHOD

//        int j = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != 0) {
//                arr[j] = arr[i];
//                j++;
//            }
//        }
//        for (int i = j; i < arr.length; i++) {
//            arr[i] = 0;
//        }
//        return arr;
//    }
}
