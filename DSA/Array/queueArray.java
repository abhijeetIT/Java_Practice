package src.main.java.JavaBasic.DSA.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class queueArray {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static Object[] queue;
    static int front = -1;
    static int rare = -1;

    public static void create() throws IOException {
        if (queue == null) {
            System.out.println("Queue not initialized. Please create the queue first.\n");
            return;
        }

        if (rare == queue.length - 1) {
            System.out.println("The Queue is full (overflow condition)..!!!\n");
            return;
        }

        System.out.print("Enter data: ");
        Object data = br.readLine();

        if (front == -1) {
            front = 0;
            rare = 0;
        } else {
            rare++;
        }

        queue[rare] = data;
        System.out.println("Data added successfully..!!\n");
    }

    public static void display() {
        if (front == -1 && rare == -1) {
            System.out.println("The Queue is empty (underflow condition)..!!!\n");
            return;
        }

        System.out.println("Data in queue:");
        for (int i = front; i <= rare; i++) {
            System.out.println(queue[i]);
        }
        System.out.println("\n");
    }

    public static void delete() {
        if (front == -1 && rare == -1) {
            System.out.println("The Queue is empty (underflow condition)..!!!\n");
            return;
        }

        System.out.println(queue[front] + " deleted..!!");
        front++;

        if (front > rare) {
            front = -1;
            rare = -1;
        }
        System.out.println("\n");
    }

    public static void insert() throws IOException {
        if (queue == null) {
            System.out.println("Queue not initialized. Please create the queue first.\n");
            return;
        }

        if (rare == queue.length - 1) {
            System.out.println("The Queue is full (overflow condition)..!!!\n");
            return;
        }

        System.out.print("Enter data: ");
        Object data = br.readLine();

        if (front == -1) {
            front = 0;
            rare = 0;
        } else {
            rare++;
        }

        queue[rare] = data;
        System.out.println("Data added successfully..!!\n");
    }

    public static void main(String[] args) throws IOException {
        int ch;

        do {
            System.out.println("0. Exit");
            System.out.println("1. Create");
            System.out.println("2. Display");
            System.out.println("3. Delete");
            System.out.println("4. Insert");
            System.out.print("Enter your choice: ");
            ch = Integer.parseInt(br.readLine());

            switch (ch) {
                case 0:
                    System.err.println("Exiting...!!");
                    break;
                case 1:
                    if (queue != null) {
                        System.out.println("The Queue is already created..!!!\n");
                        break;
                    }

                    System.out.print("Enter size of queue: ");
                    int size = Integer.parseInt(br.readLine());
                    queue = new Object[size];
                    front = -1;
                    rare = -1;

                    System.out.print("Enter how many data you want to add: ");
                    int n = Integer.parseInt(br.readLine());

                    if (n > size) {
                        System.out.println("Data limit exceeded. You can add up to " + size + " items only.\n");
                        break;
                    }

                    for (int i = 0; i < n; i++) {
                        create();
                    }
                    break;
                case 2:display();
                    break;
                case 3:delete();
                    break;
                case 4:insert();
                    break;

                default:
                    System.err.println("Invalid input...!!!\n");
            }
        } while (ch != 0);
    }
}
