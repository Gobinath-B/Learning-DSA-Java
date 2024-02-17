import java.util.Scanner;

public class Recurson {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        recur(n);
    }

    public static void recur(int n) {
        if (n > 0) {

            recur(n - 1);
            System.out.print(n+", ");
        }
//        System.out.print(n);
    }
}
