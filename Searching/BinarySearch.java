package main.java.JavaBasic.Searching;

public class BinarySearch {


    public static void binarySearch(int[] arr,int target){

        int left=0;
        int right=arr.length;
        while(left < right){
            int mid = left + (right - left) / 2;    
            
            if(arr[mid] == target){
                System.out.println("Element is in : "+mid +" index..");
                return;
            }else if(arr[mid] <  target){
                left=mid+1;
            }else{
                right= mid-1;
            }
        }
        System.out.println("Not found");
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,122,233,290,450};

        binarySearch(arr,233);
    }
}
