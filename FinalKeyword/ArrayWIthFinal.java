package main.java.JavaBasic.FinalKeyword;

public class ArrayWIthFinal {
    
    public static void main(String[] args) {
        
        final int[] arr;
        arr = new int[2];
        arr[0]=99;
        arr[0]=90;

        // arr= new int[10]; -> throw error


        System.out.println(arr[0]);

      
    }
}
