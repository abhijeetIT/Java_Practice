package main.java.JavaBasic.Array;

import java.util.LinkedHashMap;

public class FrequencyOfNumber {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,4,3,1,2,5,6,0};
       
        LinkedHashMap<Integer,Integer> freq = new LinkedHashMap<>();

        for(int i=0 ; i < arr.length ; i++){
            if(freq.containsKey(arr[i])){
                freq.put(arr[i], freq.get(arr[i])+1);
            }else{
                freq.put(arr[i], 1);
            }
        }

        System.out.println(freq);
    }
}
