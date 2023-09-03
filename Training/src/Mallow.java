import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Mallow {
        public static void main(String[] args) {
            String[] people = {"Nick", "Joe", "John", "Noah", "Damon"};

            int start = 4;
            int gifts = 13;

            distributeGifts(people, start, gifts);
        }

        public static void distributeGifts(String[] people, int start, int gifts) {
            int n = people.length;
            int[] giftsReceived = new int[n];
            for (int i = 0; i < gifts; i++) {
                int currentIndex = (start + i) % n;
                giftsReceived[currentIndex]++;
            }

            for (int i = 0; i < n; i++) {
                if(giftsReceived[i]>2)
                    System.out.println(people[i]+"-"+giftsReceived[i]);
            }

    }
}

