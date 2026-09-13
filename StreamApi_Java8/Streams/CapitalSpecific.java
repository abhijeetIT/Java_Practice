package src.main.java.JavaBasic.StreamApi_Java8.Streams;

import java.util.Arrays;
import java.util.List;

public class CapitalSpecific {
    public static void main(String[] args) {
        List<String> countrys = Arrays.asList("India","Pakishtan","Iran","USA","UAE");

        System.out.println(countrys.stream()
                                    .filter(c -> c.startsWith("I"))
                                    .map(String::toUpperCase).toList());
    }
}
