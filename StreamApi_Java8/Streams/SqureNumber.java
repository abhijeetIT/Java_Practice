package src.main.java.JavaBasic.StreamApi_Java8.Streams;

import java.util.Arrays;
import java.util.List;

public class SqureNumber {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,4,5,6);
        System.out.println(num.stream().map(x->x*x).toList());
    }
}
