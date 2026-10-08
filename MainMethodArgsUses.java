package main.java.JavaBasic;

public class MainMethodArgsUses {
    
    public static void main(String[] args) {
        // args[0]="1";
        // System.out.println(args[0]); //gives index out of bound

        //2.
        args = new String[2];
        args[1]="Abhi";

        System.out.println(args[0]); //print null becouse no value on index 0
        System.out.println(args[1]); //print "Abhi"

    }
}
