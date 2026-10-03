package main.java.JavaBasic.Loops;

public class ExploringLoop5 {

    public static int count(int i){
       // return i++; ==> this one is return a value then increment and forgot the after return increment state so return 0
       return ++i;
    }
    public static void main(String[] args) {
        
        for(int i = 0; i < 10 ; i=count(i)){
            System.out.println(i);
        }


    }
}
