package main.java.JavaBasic.OOP.Polymorphism.Compile_Static_Polymorphism;

public class WhichMethodCallQuetion1 {

    // public static void print(Integer integer){
    //     System.out.println("Integer called");
    // }

    public static void print(Object inObject){
        System.out.println("Object called");
    }

    public static void print(Long long1){
        System.out.println("Long method called");
    }

    public static void main(String[] args) {
        
        print(10); //Integer called
    }
}
