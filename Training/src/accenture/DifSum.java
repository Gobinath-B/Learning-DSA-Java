package accenture;

import java.util.Scanner;

public class DifSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        DifOf(n,m);

    }

    public static void DifOf(int n,int m) {
        int sum1=0,sum2 =0;
        for (int i = 1; i < m+1; i++) {
            if(i % n ==0){
                sum1 = sum1 +i;
//                System.out.println(i);
            }
            else {
                sum2 = sum2 + i;
            }

        }
//        System.out.println(sum1);
//        System.out.println(sum2);
        System.out.println(Math.abs(sum1 - sum2));
    }
}
