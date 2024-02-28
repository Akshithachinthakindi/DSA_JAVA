package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0,4,6,3,0,3,0,0,5,6,1,0};

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

//        int[] arr = {1,2,0,3,0,0,4,5};
//        ArrayList<Integer> tempArr = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != 0) {
//                tempArr.add(arr[i]);
//            }
//        }
//        for (int i = 0; i < tempArr.size(); i++) {
//            arr[i] = tempArr.get(i);
//        }
//        for (int i = tempArr.size(); i < arr.length; i++) {
//            arr[i] = 0;
//        }
//        System.out.print(Arrays.toString(arr));
//    }
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
