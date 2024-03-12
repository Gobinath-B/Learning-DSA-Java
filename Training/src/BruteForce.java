public class BruteForce {
    public static void main(String[] args) {
        int[]arr = {2,4,1,3,6};
        int length = 7;
        int[] temp = new int[length];
        int temoTotal = 0;
        int total = 0;

        for (int i = 1; i < length; i++) {
             temp[i] = i;
           // System.out.println(temp[i]);
        }

        for (int i = 0; i < length; i++) {
            temoTotal += i;
        }

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        int missing = temoTotal - total;
        System.out.println(temoTotal);
        System.out.println(total);
        System.out.println("missing"+missing);
    }
}
