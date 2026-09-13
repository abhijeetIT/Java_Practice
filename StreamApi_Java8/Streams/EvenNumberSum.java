package src.main.java.JavaBasic.StreamApi_Java8.Streams;

import java.util.Arrays;
import java.util.List;

public class EvenNumberSum {
    public static void main(String[] args) {
        List<Integer>  numbers = Arrays.asList(11,22,13,54,45,6,7,8);

        System.out.println(numbers.stream()
                                  .filter((i)-> i%2 == 0)
                                  .reduce(0, Integer::sum));

    }
}
