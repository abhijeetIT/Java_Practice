package main.java.JavaBasic.Array;

import java.util.Arrays;

public class RemoveDublicate {

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,4,5,6,6,6,7};

        int pointer = 0;

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] != arr[pointer]) {
                arr[++pointer] = arr[i];
            }
        }

        for(int i = 0 ; i <= pointer ; i++){
            System.out.print(arr[i]+", ");
        }
            
    }
}