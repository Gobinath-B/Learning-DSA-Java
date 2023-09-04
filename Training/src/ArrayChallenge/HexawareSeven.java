package ArrayChallenge;

import java.util.Scanner;
import java.util.TreeSet;

public class HexawareSeven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        TreeSet list = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }
        System.out.println(Math.abs(n -list.size()));
    }
}
