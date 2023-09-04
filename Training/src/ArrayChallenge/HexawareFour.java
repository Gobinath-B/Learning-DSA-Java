package ArrayChallenge;

import java.util.Scanner;

public class HexawareFour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        input = input.replace("@"," ");
        input = input.replace("$"," ");
        String arr[] = input.split(" ");
        int max =0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max,arr[i].length());
        }
        System.out.println(max+1);
    }
}
