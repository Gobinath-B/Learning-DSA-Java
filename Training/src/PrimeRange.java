public class PrimeRange {

    public static void main(String[] args) {

        int lower = 1;
        int upper = 10;

        for (int i = lower; i <= upper ; i++) {
           if(isPrime(i) == true){
               System.out.println(i);
           }

        }
    }

    public static boolean isPrime(int n) {

        if(n < 2)
            return false;

        for (int i = 2; i < n/2 ; i++) {
                if(n % i == 0)
                    return false;
        }
                return true;


    }
}
