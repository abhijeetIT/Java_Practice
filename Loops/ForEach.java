package JavaBasic.Loops;

import java.util.Arrays;

public class ForEach {
    public static void main(String[] args){
        int[] marks = {20,12,21,22};
    
        Arrays.sort(marks);
        System.err.println(marks[0]);  

        for (int i : marks) {
            System.err.println(i);
        }
    }
}
