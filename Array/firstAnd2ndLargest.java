package src.main.java.JavaBasic.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class firstAnd2ndLargest {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[] input(int[] arr) throws IOException{
    
            for(int i=0;i<arr.length;i++){
               System.out.print("Enter a element: ");
               arr[i]=Integer.parseInt(br.readLine());
            }
            return arr;
        }
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.err.print("Enter a Size: ");
            int size = Integer.parseInt(br.readLine());
            int[] arr= new int[size];
            input(arr);
            
            int max1 = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;
              
            for(int i=1;i<arr.length;i++){
                if(max1<arr[i]){
                    max2=max1;
                    max1=arr[i];
                 }else if(max2<arr[i] && max1 != arr[i]){
                    max2=arr[i];
                }
            }
            System.out.println("The first largest element: "+max1);
            System.out.println("The Second largest element: "+max2);
           
    }
}
