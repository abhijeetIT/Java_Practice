package src.main.java.JavaBasic.StreamApi_Java8.Streams;

import java.util.Arrays;
import java.util.List;
public class NameGraterThan3 {
    public static void main(String[] args) {  
        List<String> names = Arrays.asList("Abhi","Kon","Him","Priyanshu");

        System.out.println(names.stream()
                                .filter((name)->name.length() > 3)
                                .toList());
    }
}
