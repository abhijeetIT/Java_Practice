package src.main.java.JavaBasic.Array;

import java.util.Scanner;

public class DeleteElement {
    static Scanner sc = new Scanner(System.in);
    static int[] arr= new int[100];
    static int size;

     public static void Create(){
        System.out.print("Enter a size of Array: ");
        size = sc.nextInt();

        for(int i=0; i < size ; i++){
            System.out.print("Enter data "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
     }

     public static void Display(){
        System.out.println("\nYour data -:");
        for(int i=0 ; i < size ; i++){
            System.out.print(arr[i]+"\t"); 
        }
        System.out.println("\n");
     }

     public static void Delete(){
            System.out.print("Enter position to delete: ");
            int pos = sc.nextInt();
            for(int i=pos-1; i < size-1; i++){
                arr[i] = arr[i+1];
            }
            size--;
            System.out.print("data Deleted..");
     }

    public static void main(String[] args) {
        Create();
        Display();

        Delete();
        Display();

    }
}
