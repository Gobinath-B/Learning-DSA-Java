package ArrayChallenge;

public class MaxEle {
    public static void main(String[] args) {
        int arr[] = {20,87,46,93};
        int Max =0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>Max){
                Max = arr[i];
            }
        }
        System.out.println(Max);
    }


}
