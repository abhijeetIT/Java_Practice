package main.java.JavaBasic.Searching;

public class BinarySearch {


    public static void binarySearch(int[] arr,int target){

        int left=0;
        int right=arr.length;
        while(left < last){
            int mid = left + (right - left) / 2;    
            
            if(arr[mid] == target){
                System.out.println("Element is in : "+mid);
                break;
            }else if(arr[mid] >  target){
                left=mid+1;
            }else{
                right= mid-1;
            }
        }
        System.out.println("Not found");
    }

    public static void main(String[] args) {
        
    }
}
