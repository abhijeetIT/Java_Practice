package main.java.JavaBasic.InterviewPractice.String;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class NonReapetingCharachterInString {

    public static void NonReapitingCharacter(String str){


       Map<Character,Integer> uniqu = new LinkedHashMap<>();

        for(char c : str.toCharArray()){

            uniqu.put(c, uniqu.getOrDefault(c, 0)+1);
    }

    for(Map.Entry<Character, Integer> entry : uniqu.entrySet()){
        if(entry.getValue() == 1){
            System.out.println(entry.getKey());
        }
    }
}
    public static void main(String[] args) {
        
        String str = "abhijeetjha";

        NonReapitingCharacter(str);
    }
}
