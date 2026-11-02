package main.java.JavaBasic.Array;

import java.util.Arrays;

public class MergeSort {

    public static void merge(int[] arr,int startingIndex, int mid, int endingIndex){
        int[] temp = new int[endingIndex-startingIndex+1];

        int firstArray = startingIndex;
        int secondArray = mid+1;
        int pointer = 0;

        while(firstArray <= mid && secondArray <= endingIndex){
            if(arr[firstArray] < arr[secondArray]){
                temp[pointer++] = arr[firstArray++];
            }else{
                 temp[pointer++] = arr[secondArray++];
            }
        }

        while (firstArray <= mid) {
            temp[pointer++] = arr[firstArray++];
        }

        while(secondArray <= endingIndex){
            temp[pointer++] = arr[secondArray++];
        }

        for(int i=0, j =startingIndex ; i < temp.length ; i++ , j++){
            arr[j] = temp[i];
        }

    }

    public static void divide (int[] arr, int startingIndex, int endingIndex){

        if(startingIndex >= endingIndex){
            return;
        }

        int mid = startingIndex + (endingIndex-startingIndex) / 2;

        divide(arr, startingIndex, mid);
        divide(arr, mid+1, endingIndex);

        merge(arr,startingIndex,mid,endingIndex);

    }
    public static void main(String[] args) {
        int[] arr = {121,1,3,12,32,4,5,54,9,0,123,54,145,654};

        divide(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));

    }
}
