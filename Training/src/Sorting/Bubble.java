package Sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int arr[] = {2,6,7,9,1};
        bubbleSort(arr);
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.print(arr[i]+"->");
//        }
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr){
        int size = arr.length;
        // Perform multiple passes over the array
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    };
}
