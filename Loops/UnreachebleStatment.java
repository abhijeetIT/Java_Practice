package main.java.JavaBasic.Loops;

public class UnreachebleStatment {
    public static void main(String[] args) {
        

        int i;
        for( i = 0 ; i < 20 ; i++); // i declared in under specific block so that after that 2 function not able to access i
        {
            System.out.println(i);
        }
        
        System.out.println(i);
    }
}
