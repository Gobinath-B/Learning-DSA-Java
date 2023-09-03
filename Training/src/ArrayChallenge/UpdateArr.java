

package ArrayChallenge;
import java.util.*;
import java.lang.Math;
public class UpdateArr {
    public static void main(String args[]){
        //Try out your code here
        //Scanner in = new Scanner(System.in);
        int n = 5;
                //in.nextInt();

        int[] arr= new int[]{2,1,4,5,7};
       // for(int i =0 ; i <arr.length;i++){ arr[i] = in.nextInt(); }
        int m = 32;
                //in.nextInt();
        for(int i =0;i<arr.length;i++ ){
            int result = Math.abs( n - arr[i] );
            if(result < m){ arr[i] = result; } }
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
