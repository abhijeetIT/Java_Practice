package main.java.JavaBasic.Loops;

public class TableOfTwoPrinting {
    public static void main(String[] args) {
        System.out.println("2's Table============= 3's Table");
        for(int i = 3, j = 2 ; i <= 30 || j <= 20 ; i+=3, j+=2){
            System.out.println(j +"                         "+i);
        }
    }
}
