package ArrayChallenge;

import java.util.Scanner;

public class HexawareFive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char arr[] = str.toCharArray();
        System.out.println(arr);
         int c =0;
         int a=0;
         int b=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]== 'a'){
                a+=1;
            } else if (arr[i]=='b') {
                b+=1;
            } else if (arr[i]=='c') {
                c+=1;
            }

        }
        if(a>b && a>c){
            System.out.println("a is"+ a);
        }
        else if(c>b && c>a){
            System.out.println("c is"+c);
        }
        else if(b>a && b>c){
            System.out.println("b is"+b);
        }
    }
}
