package src.main.java.JavaBasic.Strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class removeVowel {
    public static void main(String[] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.print("Enter string to remove vowels : ");
            String input = br.readLine();
            StringBuilder newStr = new StringBuilder();
            
            String vowels = "AEIOUaeiou";
            for (char ch : input.toCharArray()){
                if (vowels.indexOf(ch) == -1){//if character not accure then it return -1 so codition is true and it added in new string
                    newStr.append(ch);
                }
            }
            System.out.println(newStr);
        }
    }
    