package main.java.JavaBasic.HashMap_dict;

import java.util.HashMap;

public class Quetion1 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"java" );
        map.put(2, "Python");
        map.put(1, "C");

        System.out.println(map.size());
        System.out.println(map);
    }
}
