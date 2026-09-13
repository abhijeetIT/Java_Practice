package src.main.java.JavaBasic.StreamApi_Java8.Streams;

import java.util.List;
import java.util.stream.Stream;

public class Iterate {
    public static void main(String[] args) {
        //numbers 1 to 10
        List<Integer> numbers = Stream.iterate(1,x -> x+1).limit(10).toList();
        System.out.println(numbers);
    }
}
