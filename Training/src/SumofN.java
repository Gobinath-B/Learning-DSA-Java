import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//Sum of N natural numbers
public class SumofN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = (n*(n+1)/2);
        System.out.println(sum);
    }

}
