package JavaBasic.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class insertionSort {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
    public static int[] add(int[] data) throws IOException{
        System.out.print("Enter "+data.length+" element: ");
        for(int i=0;i<data.length;i++){
            data[i] = Integer.parseInt(bf.readLine());
        }
        return data;
    }

    public static int[] sort(int[] data) throws IOException{
        int key,i,j;
        for(i=1;i<data.length;i++){
            key=data[i];
            j=i-1;
            while((j>=0) && (data[j]>key)){
                  data[j+1]=data[j];
                  j--;
            } 
            data[j+1]=key;
        }
        return data;
    }
    
    public static void main(String[] args)throws IOException{
            
        System.out.print("Enter a size of data: ");
        int size = Integer.parseInt(bf.readLine());

        int[] data = new int[size];
        
        add(data);
        sort(data);

        System.out.println("Sorted list is : ");
        for(int i=0;i<size;i++){
            System.out.printf("%d\t",data[i]);
        }
    }
}