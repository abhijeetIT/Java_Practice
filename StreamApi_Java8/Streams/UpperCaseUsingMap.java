package src.main.java.JavaBasic.StreamApi_Java8.Streams;

import java.util.Arrays;
import java.util.List;

public class UpperCaseUsingMap {
    public static void main(String[] args) {
         List<String> names = Arrays.asList("abhijeet", "priyanshu", "himanshu");

         System.out.println(names.stream().map(name -> name.toUpperCase()).toList());
    }
}
