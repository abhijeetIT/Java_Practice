package main.java.JavaBasic.Array;

public class Factorial {
    
    public static void main(String[] args) {
        
        int num = 5;

        if(num == 0){
            System.out.println(1);
        }

        int factorial=1;
        for(int i=1; i <=num ; i++){
            factorial*=i;
        }

        System.out.println(factorial);
    }
}
