package main.java.JavaBasic.OOP.Encapculation;

import java.util.ArrayList;
import java.util.List;

public class UseOfAbhijeetStringDataType {
    
    public static void main(String[] args) {

        //here is my dataType;
        AbhijeetString name = new AbhijeetString("Abhijeet Jha");

        System.out.println(name.getAbhijeetString());
        System.out.println(name.Length());

        List<AbhijeetString> list = new ArrayList<>();

        list.add(new AbhijeetString("Abhijeet Jha"));
        list.add(new AbhijeetString("Anita Jha"));
        list.add(new AbhijeetString("Amarjeet Jha"));
        list.add(new AbhijeetString("Shrawan Jha"));

        // System.out.println(list.add(list+"I added one value"+ list.add(new AbhijeetString("Kartik Jha"))));

        System.out.println(list.add(new AbhijeetString("Kartik Jha"))+" = now i print :: "+list); //this will work first add then print 


    }
}
