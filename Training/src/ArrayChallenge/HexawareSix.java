package ArrayChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class HexawareSix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
int ires=0;
int jres =0;

        int it[] = new int[3];
        int jt[] = new int[3];
        for (int l = 0; l < 3; l++) {
            it[l] = i+l;
        }
        for (int l = 0; l < 3; l++) {
            jt[l] = j+l;
        }
        for (int l = 0; l < it.length; l++) {
            ires += it[l];
        }
        for (int l = 0; l < it.length; l++) {
            jres += jt[l];
        }
        System.out.println(ires);
        System.out.println(jres);
        System.out.println(ires+jres+k);
    }
}
