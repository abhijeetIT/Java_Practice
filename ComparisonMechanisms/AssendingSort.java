package src.main.java.JavaBasic.ComparisonMechanisms;

import java.util.ArrayList;
import java.util.List;

public class AssendingSort {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(5, 3, 8, 1, 2));

        System.out.println("Before sort = "+numbers);

        numbers.sort((a,b)-> a - b);  //it takes comprator as argument

        

        System.out.println("After sort = "+numbers);
    }


}
