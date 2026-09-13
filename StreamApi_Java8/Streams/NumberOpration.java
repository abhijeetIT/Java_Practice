package src.main.java.JavaBasic.StreamApi_Java8.Streams;

import java.util.Arrays;
import java.util.List;

public class NumberOpration {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5);

// Find:
// 1. Sum of all numbers
// 2. Maximum number
// 3. Remove duplicates
// 4. Numbers greater than 4, sorted
        
        //1.
        Integer sumOfAllNumbers = numbers.stream().reduce(0,Integer::sum);
        System.out.println("Sum of all numbers : "+sumOfAllNumbers);

        //2.
        int maxNum = numbers.stream().reduce(0,Integer::max);
        System.out.println("Maximum of all numbers : "+maxNum);

        //3.
        List<Integer> NumbersRemoveDublicate = numbers.stream().distinct().toList();

        System.out.println("Remove dublicate: "+NumbersRemoveDublicate);

        //4.
        List<Integer> graterthan4 = numbers.stream()
                                           .filter(x-> x > 4)
                                           .toList();
    
        System.out.println("Numbers Grater than 4 : "+graterthan4);
        



    }
}
