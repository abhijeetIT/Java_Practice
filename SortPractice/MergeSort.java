package main.java.JavaBasic.SortPractice;

import java.util.Arrays;

public class MergeSort {
    
    public static void merge(int[] arr,int startingIndex,int mid,int endingIndex){
        int[] temp = new int[endingIndex - startingIndex+1];

        int arr1Index = startingIndex;
        int arr2Index = mid+1;
        int pointer = 0;

        while (arr1Index <= mid && arr2Index <= endingIndex){
            if (arr[arr1Index] < arr[arr2Index]){
                temp[pointer++] = arr[arr1Index++];
            }else{
                temp[pointer++] = arr[arr2Index++];
            }
        }

        while (arr1Index <= mid){
            temp[pointer++] = arr[arr1Index++];
        }

        while (arr2Index <= endingIndex) {
            temp[pointer++] = arr[arr2Index++];
        }

        for(int i=0, j=startingIndex ; i < temp.length ; i++, j++){
            arr[j] = temp[i];
        }
    }

    public static void divide(int[] arr,int startingIndex, int endingIndex){
        if(startingIndex >= endingIndex){
            return;
        }

        int mid = startingIndex + (endingIndex - startingIndex) /2 ;

        divide(arr, startingIndex, mid); //left side array
        divide(arr, mid+1, endingIndex); //right side array

        merge( arr, startingIndex, mid, endingIndex);


    }
    public static void main(String[] args) {

    int[] arr = {12,2,11,24,3,5,4,25,14,13,9,8,56};

    divide(arr,0,arr.length-1);


    System.out.println(Arrays.toString(arr));
    }
}
