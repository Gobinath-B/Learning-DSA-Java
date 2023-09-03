import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int num = in.nextInt();

         checkPrime(num);
    }

    public static void checkPrime(int n) {
        int count = 0;
        if(n < 2){
            System.out.println("The given number "+n+" "+"is not a prime number");
            System.exit(0);
        }
        else {
            for (int i = 1; i < n ; i++) {
                if(i%n == 0){
                    count+=1;
                }
            }

            if(count>2){
                System.out.println("The given number"+n+"is not a prime number");
                System.exit(0);
            }
            else {
                System.out.println("The given number"+n+"is a prime number");
            }
        }
    }
}

