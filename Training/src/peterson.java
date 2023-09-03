import java.util.Scanner;

public class peterson {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int nump = num;
        int remain = 0;
        int res = 0;
        int sum = 0;
        int temp =0;
        while (num != 0) {

             remain = num % 10;

            res = fact(remain);

            num = num / 10;
            sum = sum+res;
            temp = sum;

        }

     if(temp == nump){

         System.out.println("Peterson's Number");
     }
     else if(temp != nump){

         System.out.println(sum);
         System.out.println("Not a Peterson's Number");
     }
    }
    static int fact(int n){
      int i =1;
      int factorial =1;
      while (i<=n){
          factorial *= i ;
          i++;


      }
      return factorial;

    }
}
