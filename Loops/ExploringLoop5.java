package main.java.JavaBasic.Loops;

public class ExploringLoop5 {

    public static int count(int i){
        return i+1;
    }
    public static void main(String[] args) {
        
        for(int i = 0; i < 10 ; i=count(i)){
            System.out.println(i);
        }


    }
}
