package src.main.java.JavaBasic.InterviewPractice.Swap;

import java.util.Scanner;

public class XORswap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.print("Enter number A: ");
       int a = sc.nextInt();
       System.out.print("Enter number B: ");
       int b = sc.nextInt();


        // int  a=10,b=12;
        System.out.println("The numbers : A="+a+" B="+b);

        a=a^b;//a = 10+12 = 22
        b=a^b;//b = 22-12 = 10
        a=a^b;//a = 22-10 = 12
        System.out.println("The numbers : A="+a+" B="+b);
    }
}
