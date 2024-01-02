// "static void main" must be defined in a public class.
/*
{1:3, 2:1, 3:3, 4:3} -> here 1 and 4 have the highest freq and both are same

egs:
[1,1,1,1,1] -> length : 5
[1] -> length : 1
[] -> length : 0
*/
import java.util.*;
public class MinMaxFreq {
    public static void main(String[] args) {
        int v[] = {1,3,1,4,4,1,2,2,2,2};
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i< v.length; i++){
            if(map.containsKey(v[i])){
                map.put(v[i], map.get(v[i]) + 1);
            }else {
                map.put(v[i], 1);
            }
        }
        int maxElement = 0, minElement =0, minFreq = v.length, maxFreq = 0;
        //count(freq of element in the hashmap because if it is found then it will atleast be one) can never be 0 and count will either be less than or equal to the length of array
        for(Map.Entry<Integer, Integer> pair : map.entrySet()){ //loop over hashmap
            int count = pair.getValue(); //to store current element's freq
            int element = pair.getKey(); //to store current element

            //Check if the current element's freq is greater than maxFreq, if yes then update maxFreq with the current element's freq and the                           maxElement by current element....same with minFreq (all the below if else does this thing only..repeatedly checking for each iteration and updating the variables)


            //for updating maxFreq

            if(count > maxFreq) { //to check if current element's freq is greater than maxFreq or not
                maxElement = element; //if the current freq is greater we store the current element in maxElement
                maxFreq = count; //same for maxFreq
            }else if(count == maxFreq){ //checking if the current element's freq is equal to maxFreq
                if(element < maxElement){ //current element less than maxElement for cases where the maxFreq is same
                    maxElement = element;
                }
            }
            //{1:3, 3:1, 4:2, 2:4}
            //for updating minFreq
            if(count < minFreq){
                minElement = element;
                minFreq = count;
            }else if(count == minFreq){
                if(element < minElement){
                    minElement = element;
                }
            }
        }
        //when you come of the loop, you'll have the updated maxElement and minElement
        System.out.println("max element : "+maxElement);
        System.out.println("min element : "+minElement);
    }
}
