package main.java.JavaBasic.OOP.Polymorphism.Compile_Static_Polymorphism;


class Parent{

   // if we remove parent method so child method called in main
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

         /*The reference type is Parent, so the compiler looks for methods available through Parent.
        Parent has show(Object), but it does not declare show(String).
        Child.show(String) is an overloaded method, not an override of show(Object).
        Therefore, Java calls Parent.show(Object).
        */
        child.show("Abhijeet"); 
    }
}
