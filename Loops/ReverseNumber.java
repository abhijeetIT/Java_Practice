package main.java.JavaBasic.Loops;

public class ReverseNumber {
    public static void main(String[] args) {
        
        int num = 121115;

        int rev = 0;

        while (num != 0) {
            int digit = num % 10;
            
            rev =(rev * 10 )+digit;

             num/=10;
        }

        System.out.println(rev);
    }
}
