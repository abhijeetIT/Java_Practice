package main.java.JavaBasic.Array;

public class Sliding {
    public static void main(String[] args) {
        
        int k = 3;
        int[] arr = {1,2,3,4,4,12,121,34,58,24,242,3}; 

        int currentSum=0;
        for(int i=0; i < k ; i++){
             currentSum +=arr[i];
        }
        int max=currentSum;

        for(int i=1 ; i <= arr.length-k ; i++ ){
            currentSum = currentSum - arr[i-1]+arr[i+k-1]; //
            max = Math.max(max, currentSum);
        }
        System.out.println(max);
    }
}
