package main.java.JavaBasic.InterviewPractice.GreytrixCompany;

public class ReverseNumbers {
    public static void main(String[] args) {
        int input = 890;
        int reverse = 0;

        while (input != 0) {
            int digit = input % 10;
            reverse = (reverse * 10)+digit;
            input /= 10;
        }

        System.out.println(reverse);
    }
}
