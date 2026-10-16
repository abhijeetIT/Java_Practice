package main.java.JavaBasic.OOP.Polymorphism.Compile_Static_Polymorphism;


class Parent{
    void show(Object object){
        System.out.println("Parent");
    }
}

class Child extends Parent{
    void show(String str){
        System.out.println("Child");
    }
}
public class PerentCalled {
    
    public static void main(String[] args) {
        
        Parent child = new Child();
        
        child.show("Abhijeet"); 
    }
}
