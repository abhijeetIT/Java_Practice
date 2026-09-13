package JavaBasic.FunctionMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class primeNumber {
    public static boolean primeNum(int num){
            if(num==1){
                System.out.println(num+" is Prime number");
            }else{
               for(int i=2;i<num;i++){
                if(num%i==0){
                    return false;
                }
               }
            }
                        return true;
    }

    public static void main(String[] args)throws IOException {
        System.out.print("Enter a number: ");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        if(primeNum(num)){System.out.println(num+" is Prime number");
        }else{System.out.println(num+" is Not a Prime number");}
    }
}
