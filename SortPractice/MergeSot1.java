package main.java.JavaBasic.SortPractice;

public class MergeSot1 {

    public static void merge(int[] arr, int firstIndex, int mid , int secondIndex){
        int firstArray = firstIndex;
        int secondArray = secondIndex;
        int pointer = 0;

        while(firstArray < mid && secondArray < arr.length){
            if(arr[firstArray] < arr[secondArray]){
                arr[pointer++] = arr[firstArray++];
            }else{
                 arr[pointer++] = arr[secondArray++];
            }
        }

        while (firstArray < mid) {
            
        }
    }

    public static void divide(int[] arr, int firstIndex, int secondIndex){

        if(firstIndex > secondIndex){
            return ;
        }

        int mid = firstIndex+(secondIndex-firstIndex) /2 ;

        divide(arr, firstIndex, mid);
        divide(arr, mid+1, secondIndex);

        merge(arr,firstIndex,mid,secondIndex);

    }
    
    public static void main(String[] args) {
        int[] arr = {12,2,11,24,3,5,4,25,14,13,9,8,56};


    }
}
