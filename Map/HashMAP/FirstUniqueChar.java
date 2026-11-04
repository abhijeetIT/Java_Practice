package main.java.JavaBasic.Map.HashMAP;

import java.util.HashMap;

public class FirstUniqueChar {

    public static void firstUniqeElement(String s){
        HashMap<Character, Integer> countChar = new HashMap<>();

        for(char c : s.toCharArray()){
            countChar.put(c,countChar.getOrDefault(c, 0)+1);
        }

        for(int i=0 ; i < s.length() ; i++){
            if(countChar.get(s.charAt(i)) == 1){
                System.out.println("FirstChar is : "+s.charAt(i));
                return;
            }
        }
        System.out.println("Not found uniqe");
    }

    public static void main(String[] args) {
        firstUniqeElement("leetcode");
    }
}
