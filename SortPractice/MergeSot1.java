package main.java.JavaBasic.SortPractice;

import java.util.Arrays;

public class MergeSot1 {

    public static void merge(int[] arr, int firstIndex, int mid , int secondIndex){

        int[] temp = new int[secondIndex-firstIndex+1];
        int firstArray = firstIndex;
        int secondArray = mid+1;
        int pointer = 0;

        while(firstArray <= mid && secondArray <= secondIndex){
            if(arr[firstArray] < arr[secondArray]){
                temp[pointer++] = arr[firstArray++];
            }else{
                 temp[pointer++] = arr[secondArray++];
            }
        }

        while (firstArray <= mid) {
            temp[pointer++] = arr[firstArray++];
        }

        while (secondArray <= secondIndex) {
            temp[pointer++] = arr[secondArray++];
        }

        for(int i=0, j=firstIndex ; i < temp.length ; i++ , j++ ){
            arr[j] = temp [i];
        }
    }

    public static void divide(int[] arr, int firstIndex, int secondIndex){

        if(firstIndex >= secondIndex){
            return ;
        }

        int mid = firstIndex+(secondIndex-firstIndex) /2 ;

        divide(arr, firstIndex, mid);
        divide(arr, mid+1, secondIndex);

        merge(arr,firstIndex,mid,secondIndex);

    }
    
    public static void main(String[] args) {
        int[] arr = {12,2,11,24,3,5,4,25,14,13,9,8,56};


        divide(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
}
