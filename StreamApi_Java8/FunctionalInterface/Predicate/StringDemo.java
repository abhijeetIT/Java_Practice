package src.main.java.JavaBasic.StreamApi_Java8.FunctionalInterface.Predicate;

import java.util.function.Predicate;

public class StringDemo {
    
    public static void main(String[] args) {
        Predicate<String> startWith = (str)->str.toLowerCase().startsWith("t");

        System.out.println("The word start with t ?"+"\n"+startWith.test("Aata"));
    }
}
