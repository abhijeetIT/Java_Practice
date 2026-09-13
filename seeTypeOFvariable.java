package src.main.java.JavaBasic;

import java.util.ArrayList;


public class seeTypeOFvariable {
    public static void main(String[] args) {
        ArrayList<String> links=new ArrayList<>();
      

        System.out.println(links.getClass().getSimpleName()); //it is user to see non-primitive data type , so we can print the which data type we use
    }
}
