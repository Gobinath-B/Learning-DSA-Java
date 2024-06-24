package accenture;

import java.util.HashMap;

public class Frequency {
    public static void main(String[] args) {
        String input = "Anjukabharathi";
        input = input.toLowerCase();
        HashMap<Character,Integer> hash = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            hash.put(input.charAt(i),hash.getOrDefault(input.charAt(i),0)+1);
        }

        for (int i = 0; i < input.length(); i++) {
            System.out.println("frequency of "+input.charAt(i)+"_is_"+ hash.get(input.charAt(i)));
        }
    }
}
