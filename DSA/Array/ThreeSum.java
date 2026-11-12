package main.java.JavaBasic.DSA.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums){

        if(nums.length < 3){
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0 ; i < nums.length ; i++){
            if( i > 0 && nums[i] == nums[i-1]) continue;

            int right = nums.length-1;
            int left = i+1;

            while( left < right){
                int sum = nums[i] + nums[right] + nums[left];

                if(sum == 0 ){
                    List<Integer> triplate = Arrays.asList(nums[i] , nums[right] , nums[left]);
                    result.add(triplate);

                    while( nums[right] == nums[right-1]){
                        right--;
                    }
                    while (nums[left+1] == nums[left]) {
                        left++;
                    }

                    right--;
                    left++;
                
            }else if( sum < 0){
                left++;
            }else{
                right--;
            }
        }

        return result;
    }



    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};

        System.out.println(threeSum(nums));
    }
}
