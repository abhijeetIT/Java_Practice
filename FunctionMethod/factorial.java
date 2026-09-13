package JavaBasic.FunctionMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class factorial {
    public static int fact(int num){
           int sum=1;
           for(int i=1;i<=num;i++){
              sum=i*sum;
           }
           return sum;
    }

    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter a number for factorial: ");
        int num=Integer.parseInt(br.readLine());
        System.err.println("The factorial of these number is : "+fact(num));
    }
}
