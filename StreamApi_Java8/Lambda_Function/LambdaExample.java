package src.main.java.JavaBasic.StreamApi_Java8.Lambda_Function;


@FunctionalInterface
interface Calculator{
    int oprator(int a,int b);
}

public class LambdaExample {

   static Calculator addition = (x,y)-> x+y;
   static Calculator subtraction = (x,y)-> x-y;
   static Calculator multiplication = (x,y)-> x*y;
   static Calculator division = (x,y)-> y != 0 ? x/y: 0;

    public static void main(String[] args) {
        System.out.println("Addition: "+addition.oprator(10,5));
        System.out.println("Subtraction: "+subtraction.oprator(10,5));
        System.out.println("Multiplication: "+multiplication.oprator(1,10));
    }
}
