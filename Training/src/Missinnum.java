public class Missinnum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] +1 == arr[i+1] ){
//                System.out.println(arr[i]);
            }
            else{
                int missing = arr[i]+1;
                System.out.println("Missing Term:"+ missing);
            }
        }
    }
}
