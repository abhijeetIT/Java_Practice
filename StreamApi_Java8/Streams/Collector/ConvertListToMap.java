package src.main.java.JavaBasic.StreamApi_Java8.Streams.Collector;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListToMap {
    public static void main(String[] args) {
        List<String> countrys = Arrays.asList("India","Pakishtan","Iran","USA","UAE");

        System.out.println(countrys.stream()
                                   .collect(Collectors
                                   .toMap(x->x.toUpperCase(),x-> x.length())));
    }
}
