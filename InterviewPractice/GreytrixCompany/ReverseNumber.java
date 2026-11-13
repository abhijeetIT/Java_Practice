package main.java.JavaBasic.InterviewPractice.GreytrixCompany;

public class ReverseNumber {
    public static void main(String[] args) {
        int input = 290;
        int sum = 0 ;

        while(input != 0){
            int digit = input % 10;
            sum+=digit;
            input /= 10;
        }
        System.out.println(sum);
    }
}
