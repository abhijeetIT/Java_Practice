package src.main.java.JavaBasic.StreamApi_Java8.FunctionalInterface.Function;

import java.util.Scanner;
import java.util.function.Function;

public class PowerOfNumber {
    

    public static void main(String[] args) {
        Function<Integer,Integer> Power =(x)->x*x;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.printf("The Power of number %d is \" %d\"",num,Power.apply(num));
    }
}
