package src.main.java.JavaBasic.StreamApi_Java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAndPartitioning {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig");

// Group words by their length
// Partition words into those with even length and odd length
// Count occurrences of each word length

        //1.
        Map<Integer,List<String>> GroupByLength = words.stream()
                                                       .collect(Collectors.groupingBy(String::length));
        System.out.println("Group by word : \n"+GroupByLength);

        //2.
        Map<Boolean,List<String>> PartitionByEvenOdd = words.stream()
                                                            .collect(Collectors.partitioningBy(x-> x.length()%2 == 0));
        System.out.println("Even length word: "+PartitionByEvenOdd.get(true));
        System.out.println("ODD lenth word: "+PartitionByEvenOdd.get(false));

        //3.
        Map<Integer,Long> OccurrenceWordLength = words.stream().collect(Collectors.groupingBy(String::length,Collectors.counting()));
        System.out.println("Group by word : \n"+OccurrenceWordLength);
    }
}
