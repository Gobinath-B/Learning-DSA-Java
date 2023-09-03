import java.util.*;
public class array1 {
    public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner in = new Scanner(System.in);
//            int n1 = in.nextInt();
//            int n2 = in.nextInt();
//            int arr1[] = new int[n1];
//            int arr2[] = new int[n2];

//            for(int i = 0; i<n1;i++){
//                arr1[i] = in.nextInt();
//            }
//            for(int j = 0; j<n2;j++){
//                arr2[j] = in.nextInt();
//            }

//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//            if(Arrays.equals(arr1,arr2) && (arr1.length == arr2.length)){
//                System.out.println("Same");
//            }
//            else{
//                System.out.println("Not Same");
//            }


        int[] arr = {8,7,6,5,4,3,2,1};
reverse(arr);
        System.out.println(Arrays.toString(arr));

        };

        static void reverse(int[]arr){
      int start =0;
       int end = arr.length -1;

       while(start<end){

           swap(arr,start,end);
           start++;
           end--;
       }

        };
        static void swap(int[] arr , int a,int b){
            int temp = arr[a] ;
            arr[a] = arr[b];
            arr[b] = temp;

        };

}
