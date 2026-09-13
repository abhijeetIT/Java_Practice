package src.main.java.JavaBasic.InterviewPractice.DSA.String;

import java.util.Scanner;

public class ReverseCharacter {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        StringBuilder sb = new StringBuilder(str);

        System.out.println("Here is your reverse STR: "+sb.reverse());
        System.out.println(sb.getClass());
    }
}
