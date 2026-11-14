package main.java.JavaBasic.InterviewPractice.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

import src.main.java.JavaBasic.Strings.removeVowel;

public class MergeSort {

    public static void merge(int[] arr, int startIndex, int mid , int endingIndex){

        int[] temp = new int[endingIndex-startIndex + 1];

        int firstArrayIndex = startIndex;
        int secondArrayIndex = mid+1;
        int pointer = 0;

        while (firstArrayIndex <= mid && secondArrayIndex <= endingIndex) {
            if(arr[firstArrayIndex] < arr[secondArrayIndex]){
                temp[pointer++] = arr[firstArrayIndex++];
            }else{
                temp[pointer++] = arr[secondArrayIndex++];
            }
        }

        while (firstArrayIndex <= mid) {
             temp[pointer++] = arr[firstArrayIndex++];
        }

        while (secondArrayIndex <= endingIndex) {
            temp[pointer++] = arr[secondArrayIndex++];
        }

        for(int i = 0, j = startIndex ; i < temp.length ; i++, j++ ){
            arr[j] = temp[i];
        }
    }

    public static void divide(int[] arr,int startIndex,int endingIndex){
        if(startIndex >= endingIndex){
            return;
        }

        int mid = startIndex + (endingIndex-startIndex) /2;

        divide(arr, startIndex, mid);

        divide(arr,mid+1,endingIndex);

        merge(arr,startIndex,mid,endingIndex);


    }
    public static void main(String[] args) {
        int[] arr = {12,2,11,24,3,5,4,25,14,13,9,8,56};

        divide(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
}