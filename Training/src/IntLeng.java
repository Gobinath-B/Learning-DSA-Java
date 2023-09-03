public class IntLeng {

    static int CountDig(int n){
   int count =0;
   while(n!=0){
       n = n/10;
       count+=1;
   }
   return count;
    }

    public static void main(String[] args) {

        int n = 1234;
        //System.out.println(CountDig(n));
        int arr[] = {2332,678,98,11111,4673527};

        IntLeng objt = new IntLeng();

        for (int i = 0; i < arr.length; i++) {
            int count = objt.CountDig(arr[i]);
            System.out.println("The length of the integer_"+arr[i]+"_was_"+count);
        }


    }

}
