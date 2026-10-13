package main.java.JavaBasic.HashMap_dict;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public static String sort(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);          // sorts in place
        return new String(chars); 
    }
    public static void main(String[] args) {
        
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        HashMap<String,List> anagrams = new HashMap<>();

        for(String str : strs){
            String key=sort(str);

            anagrams.computeIfAbsent(key, k -> new ArrayList<>()).add(str);            
        }

        System.out.println(anagrams.values());
    }
}
