package main.java.JavaBasic.Loops;

public class StarPartten {
    public static void main(String[] args) {
        for(int i=1 ; i<=5;i++){
            System.out.print("\t");
            for(int j = 0 ; j<i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
