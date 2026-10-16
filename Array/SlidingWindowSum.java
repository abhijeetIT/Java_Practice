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
        int[] arr = {12,12,12,2,4,1,232,13,4};
        slidingWindow(arr,3);
    }
}
