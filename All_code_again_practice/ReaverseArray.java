package src.main.java.JavaBasic.All_code_again_practice;

import src.main.java.JavaBasic.DSA.LInklist.stack;

public class ReaverseArray {

    public static void Print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }

    public static int[] Reverse(int[] arr){

        int start = 0, end = arr.length-1;
        while (start < end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        System.out.println("Array before reverse");
        Print(arr);
        System.out.println("Array after reaverse");
        Print(Reverse(arr));
    }
}
