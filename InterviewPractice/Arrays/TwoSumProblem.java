package src.main.java.JavaBasic.InterviewPractice.Arrays;


//Given an array [2, 7, 11, 15] and target 9, return indices of numbers that add up to the target.
public class TwoSumProblem {

    public static void Cheak(int[] arr, int target){
        
        /* //it work only when array is SORTED
        
        int left=0,right=arr.length-1;
        while(left < right){
             int sum = arr[right]+arr[left];
             if(sum == target){
                 System.out.printf("Indices: %d, %d -> Values: %d + %d = %d\n", i, j, arr[i], arr[j], target);
                 return;
             }else if(sum > target){
                 right--;
             }else{
                left++;
                }
        }
        
        */

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1; j< arr.length ; j++){
                if((arr[i] + arr[j]) == target){
                       System.out.printf("Indices: %d, %d -> Values: %d + %d = %d\n", i, j, arr[i], arr[j], target);   
                    }
            }
        }
    }
    
        public static void main(String[] args) {
        
        int[] arr = {2,7,11,5,4};
        int target = 9;

        Cheak(arr,target);
    }
}
