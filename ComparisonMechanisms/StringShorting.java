package src.main.java.JavaBasic.ComparisonMechanisms;

import java.util.ArrayList;
import java.util.List;

public class StringShorting {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>(List.of("John", "Alice", "Bob", "Charlie", "Eve"));
        List<String> list = new ArrayList<>(List.of("John", "Alice", "Bob", "Charlie", "Eve"));

        nameList.sort((s1, s2)-> s1.compareTo(s2));  //it takes comprator as argument

        System.out.println("After sort = "+nameList);

    }
}
