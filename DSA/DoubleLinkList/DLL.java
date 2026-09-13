package src.main.java.JavaBasic.DSA.DoubleLinkList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DLL {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     static class Node{
        Node prev;
        String data;
        Node next;

        Node()throws IOException{
            this.prev = null;
            System.out.print("Enter data: ");
            this.data = br.readLine();
            this.next = null;
        }
    }
    static Node head = null;
    
    public static int count(){
        if (head == null) {
            System.out.println("List does not exist, please create a list first...!!");
            return 0;
        }
        Node ptr = head;
        int count=0;
    while (ptr != null) {
        count++;
        ptr = ptr.next;
    }
     return count;
    }


    public static void create()throws IOException{
        if (head != null) {
            System.out.println("List is already created...!!");
            return;
        }
        System.out.print("Enter how many element you have: ");
        int size = Integer.parseInt(br.readLine());
    
    while (size != 0) {
        Node new_node = new Node();
        
        if(head == null){
            head = new_node;
        }else{
            Node ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = new_node;
            new_node.prev = ptr;
        }
        size--;
    }
    System.out.println("List created successfully....!!!"+"\n");
    }

    public static void display(){
            if (head == null){
                System.out.println("List not created..!!!"+"\n");
                return;
            }
            Node temp = head;
            System.out.print("List: ");
            while (temp != null) {
                System.out.print(temp.data + (temp.next != null ? " -> " : ""));
                temp = temp.next;
            }
            System.out.println("\n");
    }

    public static void insert()throws IOException{
        if (head == null){
            System.out.println("List not created..!!!"+"\n");
            return;
        }
        System.out.print("Enter a position to insert: ");
        int pos = Integer.parseInt(br.readLine());
        int count = count();
        if (pos < 1 || pos > count + 1) {
            System.out.println("The position should be between 1 and " + (count + 1) + "..\n");
            return;
        }
        Node ptr = head;
        for(int i=1;i<pos-1;i++){
            ptr = ptr.next;
        }
        Node new_Node = new Node();
        new_Node.next = ptr.next;
        new_Node.prev = ptr;
        ptr.next = new_Node;
        System.out.println("Node inserted successfully at position " + pos + "...!!\n");
    }

    public static void delete()throws IOException{
        if (head == null) {
            System.out.println("List does not exist, please create a list first...!!");
            return;
        }
        System.out.print("Enter a position to insert: ");
        int pos = Integer.parseInt(br.readLine());
        int count = count();
        if (pos < 1 || pos > count) {
            System.out.println("The position should be between 1 and " + (count) + "..\n");
            return;
        }
        if (pos == 1){
            System.out.println("Data " + head.data + " deleted successfully..\n");
            head = head.next;
            head.prev = null;
            return;
        }else{
            Node ptr1=head;
            Node ptr2 = head;
            for (int i = 1; i< pos ; i++){
                ptr1 = ptr2;
                ptr2 = ptr1.next;
            }
            if(ptr2.next == null){
               ptr1.next = null;
            }else{
                ptr1.next = ptr2.next;
                ptr2.next.prev = ptr1;
            }
            System.out.println("Data deleted successfully..\n");
        }
        return;
    }

    public static void sort() throws IOException {
         if (head == null) {
            System.out.println("List does not exist, please create a list first...!!");
            return;
        }
    
        int c1 = count();
        Node ptr1, ptr2;
        
        for (int i = 0; i < c1 - 1; i++) {
            ptr1 = head;
            ptr2 = head.next;
    
            for (int j = 0; j < c1 - i - 1; j++) {
                if (ptr2 != null && ptr1.data.compareTo(ptr2.data) > 0) {/* Corrected comparison (java not support the comparision 
                    oprator in strings) 
                    Returns a positive number if ptr1.data is greater than ptr2.data
                    Returns zero if they are equal
                    Returns a negative number if ptr1.data is less than ptr2.data
                    */
                    // Swap data values
                    String temp = ptr1.data;
                    ptr1.data = ptr2.data;
                    ptr2.data = temp;
                }
                ptr1 = ptr2;
                ptr2 = ptr2.next;
            }
        }
        System.out.println("Your list sorted successfully..!!\n");
    }


    public static void main(String[] args) throws IOException{
           
        int ch;
                do {
                    System.out.println("0. Exit");
                    System.out.println("1. Create");
                    System.out.println("2. Display");
                    System.out.println("3. Insert");
                    System.out.println("4. Delete");
                    System.out.println("5. Sort"+"\n"); //it only sort a string so if numbers on in string so it give incorecct sorting.
                    System.out.print("Enter your choice: ");
                    ch = Integer.parseInt(br.readLine());
        
                    switch (ch) {
                        case 0:System.err.println("Exiting...!!");
                            break;
                        case 1:create();
                            break;
                        case 2:display();
                            break;
                        case 3:insert();
                            break;
                        case 4:delete();
                            break;
                        case 5:sort();
                            break;
                        default:System.err.println("Invalid input...!!!\n");
                    }
                } while (ch != 0);
    }
}
