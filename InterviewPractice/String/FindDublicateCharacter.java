package src.main.java.JavaBasic.InterviewPractice.DSA.String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindDublicateCharacter {

    public static void CharDublicate(String Str){

        List<Character> list = new ArrayList<>();

        for(int i =0; i < Str.length() ; i++) {
            for(int j = i+1 ; j< Str.length() ; j++ ){
                if(Str.charAt(i) == Str.charAt(j) && !list.contains(Str.charAt(i))){
                    list.add(Str.charAt(j));
                }
            }
        }

           System.out.println("The dublicate characters: "+list);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.next();

        CharDublicate(str.toLowerCase());
    }
}
