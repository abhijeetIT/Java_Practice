package src.main.java.JavaBasic.Array;

import java.util.Scanner; 

public class ElementInsertInArray {
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

     public static void display(){
        System.out.println("\nYour data -:");
        for(int i=0 ; i < size ; i++){
            System.out.print(arr[i]+"\t");  
        }
        System.out.println("\n");
     }

     public static void insert(){
            System.out.print("Enter data to insert: ");
            int data = sc.nextInt();

            System.out.print("Enter position: ");
            int pos = sc.nextInt();
            for(int i=size; i >= pos; i--){
                arr[i] = arr[i-1];
            }
            arr[pos-1]= data;
            size++;
            System.out.print("data inserted..");
     }

    public static void main(String[] args) {
        Create();
        display();

        insert();
        display();

    }
}