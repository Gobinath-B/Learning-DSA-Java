package accenture;

import java.util.Locale;

public class Capt {
    public static void main(String[] args) {
        String input = "Made for eachother";
        String low = input.toLowerCase();
        System.out.println(capitalize(low));
    }
    static String capitalize(String in){
      StringBuilder result = new StringBuilder();
      String[] words= in.split("\\s+");
      for (String word: words ){
          if (word.length()>1){
              word = word.substring(0,1).toUpperCase()+word.substring(1, word.length()-1)+word.substring(word.length()-1).toUpperCase();
          }else {
              word.toUpperCase();
          }
          result.append(word).append(" ");
      }

      String out = result.toString();
      return out.trim();
    };
}