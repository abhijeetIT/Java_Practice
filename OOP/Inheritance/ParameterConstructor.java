package main.java.JavaBasic.OOP.Inheritance;

public class ParameterConstructor {

    static class A{
        A(int i){
            System.out.println("A called");
        }
    }
    static class B extends A{
        
        B(){
            super(0);  //always handle it only inside constructor
            System.out.println("B called");
        }
    }
    public static void main(String[] args) {
         
    }
}
