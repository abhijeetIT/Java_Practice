package src.main.java.JavaBasic.StreamApi_Java8.FunctionalInterface.Supplier;

import java.util.function.Supplier;

public class ReturnPi {
    public static void main(String[] args) {
        Supplier<Double> PI = ()-> Math.PI;
        System.out.println("The value of pi is : "+PI.get());
    }
}
