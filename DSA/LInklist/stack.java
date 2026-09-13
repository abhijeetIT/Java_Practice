package src.main.java.JavaBasic.DSA.LInklist;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class stack {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static class Node {
        String data;
        Node link;

        Node() throws IOException {
            System.out.print("Enter data: ");
            this.data = br.readLine();
            this.link = null;
        }
    }
    static Node head = null;

    public static void insert() throws IOException{
          Node new_node = new Node();
             if(head == null){
                new_node.link = null;
                head = new_node;
             }else{
                new_node.link = head;
                head = new_node;
             }
                System.out.println("Data add into the stack....!!!");
                System.out.println("\n");
             }
    
    public static void display(){
        if(head == null){
            System.out.println("The stack is empty..!!!");
            return;
        }
        Node ptr = head;
        System.out.println("Data in stack= "+"\n");
        while(ptr != null){
            System.out.println(ptr.data);
            ptr = ptr.link;
        }
        System.out.println("\n");
    }

    public static void delete(){
        if(head == null){
            System.out.println("The stack is empty..!!!");
            return;
        }
        System.out.println(head.data+" data deleted..!!");
        head = head.link;
        System.out.println("\n");
    }
    public static void main(String[] args) throws IOException{
        int ch;
        do {
            System.out.println("0. Exit");
            System.out.println("1. Insert");
            System.out.println("2. Display");
            System.out.println("3. Delete");
            System.out.print("Enter your choice: ");
            ch = Integer.parseInt(br.readLine());

            switch (ch) {
                case 0:System.err.println("Exiting...!!");
                    break;
                case 1:insert();
                    break;
                case 2:display();
                    break;
                case 3:delete();
                    break;
                default:System.err.println("Invalid input...!!!\n");
            }
        } while (ch != 0);
    }
}
