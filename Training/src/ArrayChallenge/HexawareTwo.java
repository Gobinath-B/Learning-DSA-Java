package ArrayChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class HexawareTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int min = arr[0];
        int max = 0;

        for (int i = 0; i < n ; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }

        for (int i = 0; i < n ; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int result = max-min;
        System.out.println("Maximum profit :"+result );
    }
}
