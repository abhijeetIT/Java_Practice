package main.java.JavaBasic.Strings;

import java.util.Arrays;

public class ReverseString {

    public static String reverse(String str){
        
        char[] charString= str.toCharArray();

        int start = 0;
        int end = charString.length-1;

        while(start < end){
            char temp = charString[start];
            charString[start] = charString[end];
            charString[end] = temp;

            start++;
            end--;
        }
        return new String(charString);
    }
    
    public static void main(String[] args) {
        
        String str = "abhijeet";

        System.out.println(reverse(str));
    }
}
