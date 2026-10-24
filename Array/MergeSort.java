package main.java.JavaBasic.Array;

import java.util.Arrays;

public class MergeSort {

    public static void divide(int[] arr,int startingIndex, int endingIndex){
        if(startingIndex >= endingIndex){
            return;
        }

        int mid = startingIndex + (endingIndex - startingIndex) /2 ;

        divide(arr, startingIndex, mid); //left side array
        divide(arr, mid+1, endingIndex); //right side array




    }
    public static void main(String[] args) {

    int[] arr = {12,2,11,24,3,5,4,25,14,13,9,8,56};

    divide(arr,0,arr.length-1);


    System.out.println(Arrays.toString(arr));
    }
}
