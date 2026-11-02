package main.java.JavaBasic.Array;

import java.util.Arrays;

public class MergeSort {

    public static void divide (int[] arr, int startingIndex, int endingIndex){

        if(startingIndex > endingIndex){
            return;
        }

        int mid = endingIndex + (endingIndex-startingIndex) / 2;

        merge(arr,startingIndex,mid,endingIndex);
        divide(arr, startingIndex, mid);
        divide(arr, mid+1, endingIndex);
    }
    public static void main(String[] args) {
        int[] arr = {121,1,3,12,32,4,5,54,9,0,123,54,145,654};

        divide(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));

    }
}
