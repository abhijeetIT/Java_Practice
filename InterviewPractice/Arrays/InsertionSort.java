package main.java.JavaBasic.InterviewPractice.Arrays;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr){
        if(arr.length <= 1){
            return;
        }

        for(int i=1 ; i < arr.length ; i++){
            int key = arr[i];
            int j = i-1;

            while((j >= 0) && (arr[j] > key)){
                arr[j+1]=arr[j];
                j--;
            }
            arr[++j] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12,2,11,24,3,5,4,25,14,13,9,8,56};

        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
