package main.java.JavaBasic.DataTypes.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class CRUD {


    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.remove();
        queue.offer(1);
        queue.peek();

        System.out.println(queue);

    }
}
