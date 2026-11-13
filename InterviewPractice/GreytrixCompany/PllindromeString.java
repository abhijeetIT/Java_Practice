package main.java.JavaBasic.InterviewPractice.GreytrixCompany;

public class PllindromeString {
    public static void main(String[] args) {
        String str = "maiaam";

        Boolean flag = true;
        int end = str.length()-1,start = 0;

        while (start < end) {
            if(str.charAt(start) != str.charAt(end)){
                flag = false;
                break;
            }
            end--;
            start++;
        }

        if(flag){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
