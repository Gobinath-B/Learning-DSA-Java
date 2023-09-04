package ArrayChallenge;

import java.util.Scanner;

public class HexawareThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String num = in.next();

        char arr[] = num.toCharArray();
        char max = arr[0];
        for (int i = 0; i < arr.length ; i++) {
           int current = arr[i];
           if(current>max){
               max = arr[i];
           }
        }
        System.out.println(max);
    }
}
