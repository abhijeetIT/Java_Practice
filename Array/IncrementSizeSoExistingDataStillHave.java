package main.java.JavaBasic.Array;

import java.util.Arrays;

public class IncrementSizeSoExistingDataStillHave {
    public static void main(String[] args) {
        int[] arr = new int[1];

        arr[0]=99;
        System.out.println(Arrays.toString(arr));

        arr = new int[2];
        arr[1]=90;

         System.out.println(Arrays.toString(arr));
    }
}
