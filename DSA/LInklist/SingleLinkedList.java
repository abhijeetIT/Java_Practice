package src.main.java.JavaBasic.DSA.LInklist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SingleLinkedList {
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

    public static int count() {
        if (head == null) {
            System.out.println("List does not exist, please create a list first...!!");
            return 0;
        }
        int count = 0;
        Node ptr = head;
        while (ptr != null) {
            count++;
            ptr = ptr.link;
        }
        return count;
    }

    public static void create() throws IOException {
        if (head != null) {
            System.out.println("List is already created...!!");
            return;
        }
        System.out.print("Enter the number of elements to create: ");
        int limit = Integer.parseInt(br.readLine());
        while (limit > 0) {
            Node new_node = new Node();
            if (head == null) {
                head = new_node;
            } else {
                Node temp = head;
                while (temp.link != null) {
                    temp = temp.link;
                }
                temp.link = new_node;
            }
            limit--;
        }
        System.out.println("List created successfully...!!\n");
    }

    public static void display() {
        if (head == null) {
            System.out.println("List does not exist, please create a list first...!!");
            return;
        }
        Node temp = head;
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data + (temp.link != null ? " -> " : ""));
            temp = temp.link;
        }
        System.out.println("\n");
    }

    public static void insert() throws IOException {
        if (head == null) {
            System.out.println("List does not exist, please create a list first...!!");
            return;
        }

        int count = count();
        System.out.print("Enter the position to insert data: ");
        int pos = Integer.parseInt(br.readLine());
        if (pos < 1 || pos > count + 1) {
            System.out.println("The position should be between 1 and " + (count + 1) + "..\n");
            return;
        }

        Node new_Node = new Node();
        if (pos == 1) {
            new_Node.link = head;
            head = new_Node;
        } else {
            Node ptr = head;
            for (int i = 1; i < pos - 1; i++) {
                ptr = ptr.link;
            }
            new_Node.link = ptr.link;
            ptr.link = new_Node;
        }
        System.out.println("Node inserted successfully at position " + pos + "...!!\n");
    }
 
    public static void delete() throws IOException {
        if (head == null) {
            System.out.println("List does not exist, please create a list first...!!");
            return;
        }

        int count = count();
        System.out.print("Enter the position to delete data: ");
        int pos = Integer.parseInt(br.readLine());
        if (pos < 1 || pos > count) {
            System.out.println("The position should be between 1 and " + count + "..\n");
            return;
        }
        
        if (pos == 1) {
            System.out.println("Data " + head.data + " deleted successfully..\n");
            head = head.link;
            return;
        }
        
        Node ptr = head;
        for (int i = 1; i < pos - 1; i++) {
             ptr = ptr.link; 
        }
        System.out.println("Data " + ptr.link.data + " deleted successfully..\n");
        ptr.link = ptr.link.link;
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
            ptr2 = head.link;
    
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
                ptr2 = ptr2.link;
            }
        }
        System.out.println("Your list sorted successfully..!!\n");
    }

    public static void reverse(){
        if (head == null || head.link == null) {
            System.out.println("List does not exist, please create a list first...!!");
            return;
        }
        
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.link; // Store next node
            current.link = prev;      // Reverse current node's pointer
            prev = current;           // Move pointers one position ahead
            current = next;
        }
        head = prev; // Update head to new first node
        System.out.println("Your list reversed successfully..!!\n");
    }
    
    public static void main(String[] args) throws IOException {
        int ch;
        do {
            System.out.println("0. Exit");
            System.out.println("1. Create");
            System.out.println("2. Display");
            System.out.println("3. Insert");
            System.out.println("4. Delete");
            System.out.println("5. Sort"); //it only sort a string so if numbers on in string so it give incorecct sorting.
            System.out.println("6. Reverse"+"\n");
            System.out.print("Enter your choice: ");
            ch = Integer.parseInt(br.readLine());

            switch (ch) {
                case 0:System.err.println("Exiting...!!");
                    break;
                case 1:
                    create();
                    break;
                case 2:
                    display();
                    break;
                case 3:insert();
                    break;
                case 4:delete();
                    break;
                case 5:sort();
                    break;
                case 6:reverse();
                    break;
                default:System.err.println("Invalid input...!!!\n");
            }
        } while (ch != 0);
    }
}