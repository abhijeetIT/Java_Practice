package JavaBasic.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class practice {
    public static void main(String[] argu) throws IOException{
        System.out.println("Abhijeet");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine());

        System.out.println(num);
        inPut(argu);
    }

    @SuppressWarnings("resource")
    public static void inPut(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
    }
}


