package main.java.JavaBasic.HashSet;

import java.util.Arrays;
import java.util.HashSet;

public class DoesItContainUniqe {
    public static void main(String[] args) {
        
        HashSet<String> stringHashSet = new HashSet<>(Arrays.asList("Abhi","Abhi","abhi","Amar"));

        System.out.println(stringHashSet);

        HashSet<Double> doublesHashset = new HashSet<>(Arrays.asList(1.23,1.23,1.2,1.56));
        System.out.println(doublesHashset);
    }
}
