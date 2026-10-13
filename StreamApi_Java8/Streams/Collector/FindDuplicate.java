package main.java.JavaBasic.StreamApi_Java8.Streams.Collector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicate {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,6,5,8,1);

        Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicates = nums.stream()
                                      .filter(x -> !unique.add(x))
                                      .collect(Collectors.toSet());

        System.out.println("Unique elements = " + unique);
        System.out.println("Duplicate elements = " + duplicates);
    }
}


