package main.java.JavaBasic.Strings;

import src.main.java.JavaBasic.Strings.removeVowel;

public class AddBinary {

    public static String addBinary(String A, String B){
        StringBuilder sb = new StringBuilder();

        int carry = 0, i = A.length()-1, j = B.length()-1;

        while(i >= 0 || j >= 0 || carry != 0){
            int sum = carry;

            if(i >= 0){
                sum+=A.charAt(i) - '0';
                i--;
            }

            if(j >= 0){
                sum+= B.charAt(j) - '0';
                j--;
            }

            sb.append(sum % 2);

            carry = sum /2;
        }

        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(addBinary("110","1"));
    }
}
