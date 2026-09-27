package main.java.JavaBasic.Array;

import java.util.Arrays;
import java.util.HashSet;

public class FIndDublicate {

    public static void findDublicate(int[] arr){

        HashSet<Integer> dublicate = new HashSet<>();
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i]!=arr[j]){
                    
                }
            }
        }

    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5,5,6,77,77,34,1,3,78,9};

        findDublicate(arr);
    }
}
