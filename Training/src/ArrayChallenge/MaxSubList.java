package ArrayChallenge;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MaxSubList {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,7,8,11};

        ArrayList<Integer> maxSubArray = findMax(arr);
        System.out.println("Longest Consicutive Subarray"+ maxSubArray);
    }

    static ArrayList<Integer> findMax(int[] arr){
        int sum = arr[0];
        int Maxx = Integer.MIN_VALUE;
        int start = 0;
        int end =0;
        int tempstart =0;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i-1]+1){
                sum += arr[i];
            }else{
               if(sum>Maxx){
                  Maxx = sum;
                  start = tempstart;
                  end = i-1;
               }
               sum = arr[i];
               tempstart = i;
            }
        }
        if(sum> Maxx){
            Maxx = sum;
          start = tempstart;
          end = arr.length-1;

        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            list.add(arr[i]);
        }
        System.out.println(list);
        return list;
    };
}
