package JavaBasic.Loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class primeNumber {
    public static void main(String[] args) throws NumberFormatException, IOException  {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number: ");
        int num = Integer.parseInt(bf.readLine());
        
        if(num==1){
            System.err.println("The number is Prime number!");
        }else{
        boolean primeNumber=true;
       
        for(int i=2;i<num;i++){
            if(num%i==0){
                primeNumber=false;
                break;
            }
        }
        if(primeNumber){
             System.err.println("The number is Prime number!");
         }else{
            System.out.println("Not a prime number!!");
         }
    }
}
}
