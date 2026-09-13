package src.main.java.JavaBasic.StreamApi_Java8.Streams.Partition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddEven {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

       Map<Boolean,List<Integer>> oddeven=  numbers.stream().collect(Collectors.partitioningBy(element->element %2 ==0));
        
       System.out.println("Even Numbers in List: "+oddeven.get(true));
       System.out.println("Odd numbers in List: "+oddeven.get(false));
    }
}
