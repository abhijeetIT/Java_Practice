package main.java.JavaBasic.SortPractice;

public class BinarySearching {

    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,7,9,10,12,13,15,16,17,18,19,20,21,23,244,455,543,564,654,6543,8888};

        int start =0;
        int end = arr.length;

        int target=10;
 
        while(start < end){
            int mid = end+(start-end)/2;
        
            if(arr[mid]==target){
                System.out.println("Position "+mid);
                break;
            }else if(target > arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
    }
}
