package main.java.JavaBasic.OOP;

public class WhichConstructorCall {

    static class Parent {
        Parent(){
            System.out.println("Parent constructor call..");
        }
    }

    static class Child extends Parent{
        Child(){
            System.out.println("Child constructor called..");
        }
    }
    
    public static void main(String[] args) {
        
        // Child child = new Child();

        Parent parent = new Child();

    }
}
