package src.main.java.JavaBasic.InterviewPractice.DSA.String;

import java.util.Scanner;

public class ReverseWordString {

    public static String ReverseWord(String str){
        String[] words = str.trim().split("\\s+"); //Split word by space

        StringBuilder sb = new StringBuilder();
         for(int i = words.length-1; i >= 0; i--){
            sb.append(words[i]).append(" ");
         }
         
         return sb.toString().trim();

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        //it reverse a characters not WOrd ; Expected Output-> Java Love i , but here -> avaJ evoL i

        // StringBuilder sb = new StringBuilder(str);
        // System.out.println("Reverse : "+sb.reverse().toString());

        //here is a most efficient way
        System.out.println("Reverse String: "+ReverseWord(str));

    }
}
