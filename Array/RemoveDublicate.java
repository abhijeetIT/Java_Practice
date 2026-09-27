package main.java.JavaBasic.Array;

import java.util.Arrays;

public class RemoveDublicate {

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,4,5,6,6,6,7};

        int j=0;
        for(int i=0; i<arr.length; i++){
           if(arr[j]!=arr[i]){
            j++;
            arr[j]=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
            
        }
    }