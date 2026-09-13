package src.main.java.JavaBasic.StreamApi_Java8.FunctionalInterface.Supplier;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class First {
    public static void main(String[] args) {
        
        Supplier<String> Value = () -> LocalDateTime.now().toString();

        System.out.println("Current timestramp is : "+Value.get());
    }
}
