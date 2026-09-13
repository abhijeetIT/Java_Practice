package src.main.java.JavaBasic.StreamApi_Java8.Streams;

import java.util.Arrays;
import java.util.List;

public class SumOfNumbers {
    public static void main(String[] args) {

        List<Integer>  numbers = Arrays.asList(1,2,3,4,5,6,7,8);

        System.out.println(numbers.stream().reduce(Integer::sum).get());    

        /*The reduce() method is used to aggregate elements of a Stream into a single result, such as sum, max, min, or concatenation.
        It takes a binary operation that combines two elements at a time.
        The operation keeps reducing the stream until one result remains
    */
    }
}
