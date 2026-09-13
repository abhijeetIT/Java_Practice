package src.main.java.JavaBasic.InterviewPractice.Arrays;

import java.util.ArrayList;
import java.util.List;

public class DublicateNumber {
    
    public static void dublicateNumber(int[] arr) {
           List<Integer> dublicate = new ArrayList<>();

           for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1; j < arr.length ; j++){
                if(arr[i] == arr[j] && !dublicate.contains(arr[i])){
                    dublicate.add(arr[i]);
                }
            }
           }

           System.out.println("Dublicate element = "+dublicate);
          
    }

    public static void main(String[] args) {
        int[] arr = {1,4,2,3,4,4,5,1,3};

        dublicateNumber(arr);
    }
}
