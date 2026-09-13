package src.main.java.JavaBasic.StreamApi_Java8.FunctionalInterface.Predicate;

import java.util.function.Predicate;

public class PredicateOddEven {
    public static void main(String[] args) {
        Predicate<Integer> OddEven = (num)-> num%2 ==0;

        System.out.println("Is 5 Even? " + OddEven.test(5));
    }
}
