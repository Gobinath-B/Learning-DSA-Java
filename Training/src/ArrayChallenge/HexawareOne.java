package ArrayChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HexawareOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String arr[] = new String[n];

        for (int i = 0; i < n ; i++) {
            arr[i] = in.next();
        }
        ArrayList<String> oddOnly = new ArrayList<String>();
        //System.out.println(Arrays.toString(arr));
         int len =0;

        for (int i = 0; i < n; i++) {
            len = arr[i].length();
            if(len%2==1){
                oddOnly.add(arr[i]);
            }
        }
//        for (int i = 0; i < oddOnly.size(); i++) {
//            System.out.println(oddOnly.get(i));
//        }
        String result = "";
        String temp = "";
        int max = 0;
        int size = oddOnly.size();
        for (int i = 0; i < oddOnly.size() ; i++) {
             temp = oddOnly.get(i);
             if( temp.length() > max){
                 max = temp.length();
                 result = temp;

             }
        }

        System.out.println(result);
    }
}
