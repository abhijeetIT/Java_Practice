package src.main.java.JavaBasic.StreamApi_Java8.FunctionalInterface.Consumer;

import java.util.function.Consumer;

public class First {
    public static void main(String[] args) {
        Consumer<Integer> num = (a)-> System.out.println("Your Number is : "+a);

        num.accept(12);
        
    }
}
