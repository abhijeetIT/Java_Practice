package main.java.JavaBasic.OOP.Polymorphism.Compile_Static_Polymorphism;

public class WhichOneCalledQuetion {
    
    static void print(int Int){
        System.out.println("Int called");
    }

    static void print(Integer integer){
        System.out.println("Integer called");
    }

    public static void main(String[] args) {
        
        print(10);
    }
}
