package ArrayChallenge;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Revarr {
    public static void main(String[] args) {
        int [] arr = {9,8,7,6,5,4,3,2,1};
        reverse(arr);
        System.out.println("reversed array:" + Arrays.toString(arr));
    }

    public static int[] reverse (int[] arr){
        int start = 0;
        int end = arr.length-1;

        for (int i = 0; i < arr.length; i++) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start ++;
            end --;
        }
        return arr;
    }
}
