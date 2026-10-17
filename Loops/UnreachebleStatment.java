package main.java.JavaBasic.Loops;

public class UnreachebleStatment {
    public static void main(String[] args) {
        

        // int i=0;
        for(int i = 0 ; i < 20 ; i++);
        {
            System.out.println(i);
        }
        
        System.out.println(i);
    }
}
