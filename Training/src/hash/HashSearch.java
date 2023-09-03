package hash;

import java.util.HashMap;

public class HashSearch {
    public static void main(String[] args) {
        HashMap<Integer,Boolean> hashmap = new HashMap ();
        int[] arr = {2,46,99,93,83,7,3,18,45};
        int target = 93;
        for(int num : arr){
            if(num == target){
                hashmap.put(num,true);
            }
        }
        if (hashmap.containsKey(target)){
            System.out.println("Target found");
        }
        else{
            System.out.println("Target not found in array");
        }

    }
}
