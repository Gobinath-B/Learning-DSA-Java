package accenture;

import java.util.HashMap;
import java.util.HashSet;

public class FindOne {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,1,5,5};
        HashMap<Integer,Integer>list = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
           list.put(arr[i],list.getOrDefault(arr[i],0)+1);
        };
        int unique = 0;
        for (int i : list.keySet()) {
            if(list.get(i)==1){
                unique = i;
                break;
            }
        }
        System.out.println(unique);
    }
}
