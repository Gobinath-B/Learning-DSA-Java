package ArrayChallenge;

import java.lang.reflect.Array;

public class ConcatArray {
    public static void main(String[] args) {
       int []a = {1,2,3};
       int[] b = {1,2,3};
       int[] concatinated = concat(a,b);
       printArray(concatinated);

    }
    public static int[] concat(int[] a,int[] b){
        int[] arr = new int[a.length+b.length];

        for (int i = 0; i < a.length; i++) {
            arr[i]= a[i];
        }
        for (int i = 0; i < b.length ; i++) {
            arr[a.length +i] = b[i];
        }
       return arr;
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
