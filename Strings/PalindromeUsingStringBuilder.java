package src.main.java.JavaBasic.Strings;

import java.util.Scanner;

public class PalindromeUsingStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a String: ");
        String originalString = sc.nextLine().toLowerCase();

        System.out.println(originalString.equals(
                                                 new StringBuilder(originalString)
                                                 .reverse()
                                                 .toString())
                                                 ? "its a palindrome":
                                                 "its Not palindrome"
                                                );
    }
}
