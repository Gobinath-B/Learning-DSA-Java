package hash;

import java.util.HashMap;

class Solution {
    public static void main(String[] args) {
        String s = "II";
        String input = s;
        int output = 0;
        char[] arr = input.toCharArray();
        int leng = arr.length;
        HashMap<String, Integer> hashmap = new HashMap<>();
        hashmap.put("I", 1);
        hashmap.put("V", 5);
        hashmap.put("X", 10);
        hashmap.put("L", 50);
        hashmap.put("D", 500);
        hashmap.put("M", 1000);

        for (int i = 0; i < leng; i++) {
            char inv = arr[i];
            String numeral = String.valueOf(inv);
            if (hashmap.containsKey(numeral)) {
                output += hashmap.get(numeral);
            } else {
                System.out.println("Invalid character in input: " + numeral);
                return;
            }

            System.out.println(output);
        }
    }
}
