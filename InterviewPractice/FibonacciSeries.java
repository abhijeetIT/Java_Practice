package main.java.JavaBasic.InterviewPractice;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c=a+b;

        for(int i = 0 ; i < 4; i++){
            System.out.print(a+" ");
            a=b;
            b++;
            c=a+b;
        }
    }
}
