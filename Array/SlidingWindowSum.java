package main.java.JavaBasic.Array;

public class SlidingWindowSum {
    
    static void slidingWindow(int[] arr, int day){
        int slidingWindowSum=0;

        for(int i=0; i < day ; i++){
            slidingWindowSum+=arr[i];
        }
        int max =  slidingWindowSum;
        for(int i = 1; i <= arr.length-day ; i++){
           
            slidingWindowSum=slidingWindowSum - arr[i-1]+arr[i+day-1];
            max = Math.max(max, slidingWindowSum);
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,12,121,34,58,24,242,3};
        slidingWindow(arr,3);
    }
}
