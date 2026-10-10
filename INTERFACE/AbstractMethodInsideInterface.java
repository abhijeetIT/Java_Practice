package main.java.JavaBasic.INTERFACE;

public interface AbstractMethodInsideInterface {
    
    abstract void print(); //Interface have abstract method


    // private void printPrivate(); // Private method with body allowed

     private void printPrivate() {
        System.out.println("Private method");
    }

  //  final void printfinal();  // final not allowed in interface


  //only with body
  static void staticMethod(){
    System.out.println("Static");
  }


    //default only with body
    default void defaultMethod(){
        System.out.println("its default");
    }

}
