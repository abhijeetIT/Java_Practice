package src.main.java.JavaBasic.StreamApi_Java8.Streams.Collector;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CountAccurence {
    public static void main(String[] args) {
        String Sentance = "hello world hello java";

       System.out.println( Arrays.stream(Sentance.split(" ")).collect(Collectors.groupingBy(x->x,Collectors.counting())));

    }
}
