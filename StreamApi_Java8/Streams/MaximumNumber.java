package src.main.java.JavaBasic.StreamApi_Java8.Streams;

import java.util.Arrays;
import java.util.List;

public class MaximumNumber {
    public static void main(String[] args) {
        List<Integer>  numbers = Arrays.asList(1,2,3,4,5,6,7,8);

        System.out.println(numbers.stream().reduce(0,Integer::max));
    }
}
