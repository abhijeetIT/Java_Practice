package main.java.JavaBasic.Varargs;

public class Quetion2 {

    public static int lengthOfArguments(int... arr){

        return arr.length;
    }
    public static void main(String[] args) {
        
       System.out.println(lengthOfArguments(1,2,3));
       
       System.out.println(lengthOfArguments(new int[]{1,2,4,3}));

       //here both excepted
    }
}
