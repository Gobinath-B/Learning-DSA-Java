package hash;

import java.util.HashMap;

public class Hashmapinit {

    public static void main(String[] args) {
        HashMap<String,Integer> fun = new HashMap<>();

        fun.put("a",1);
        fun.put("b",2);
        fun.put("c",3);
        fun.put("d",4);
        fun.put("e",5);

        System.out.println(fun);
        System.out.println(fun.containsValue(5));

    }
}
