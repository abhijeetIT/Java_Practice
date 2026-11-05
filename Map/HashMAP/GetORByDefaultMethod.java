package main.java.JavaBasic.Map.HashMAP;

import java.util.HashMap;
import java.util.Map;

public class GetORByDefaultMethod {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Strign");

        System.out.println(map.get(1));
        System.out.println(map.getOrDefault(2, "Abhi yaha nhi hai")+1);
    }
}