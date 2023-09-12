package accenture;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int reverse =0;
        int reminder;
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int temp = num;
        while(num>0){
            reminder = num%10;
            reverse= (reverse*10)+reminder;
            num = num/10;
        }

        if(temp == reverse){
            System.out.println("Its a palindrome");
        }
        else{
            System.out.println("Its not a palindrome");
        }
    }
}
