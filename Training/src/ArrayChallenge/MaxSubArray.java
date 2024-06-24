package ArrayChallenge;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,7,8,11};
        int sum = arr[0];
        int Maxx = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                sum = sum + arr[i];
            } else {

                Maxx = Math.max(Maxx, sum);
                sum = arr[i];
            }
        }
        Maxx = Math.max(Maxx,sum);

        System.out.println(Maxx);
    }
}
