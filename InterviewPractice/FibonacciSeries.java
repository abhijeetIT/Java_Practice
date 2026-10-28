package main.java.JavaBasic.InterviewPractice;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a=0;
        int b=1;

        for(int i = 0 ; i < 4; i++){
            System.out.print(a+" ");

            int c = a+b;
            a=b;
            b=c;
        }
    }
}
