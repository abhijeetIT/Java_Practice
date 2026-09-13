package src.main.java.JavaBasic.StreamApi_Java8.FunctionalInterface.Function;

import java.util.function.Function;

public class LengthString {
    public static void main(String[] args) {
        Function<String,Integer> strLength = (str)-> str.length();

        System.out.println("The length of the string is: " + strLength.apply("Hello World"));

    }

}

