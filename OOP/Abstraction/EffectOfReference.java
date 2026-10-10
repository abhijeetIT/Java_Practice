package main.java.JavaBasic.OOP.Abstraction;


abstract class A {
     
    abstract void hello();

    void world(){
        System.out.println(" Word from A");
    }

    public void Exclusive_A_Class_Method(){
        System.out.println("Hii you created A class Reference Object");
    }
}

class B extends A{

    void hello(){
        System.out.print("Hello");
    }

    public void Exclusive_B_Class_Method(){
        System.out.println("Hii you created B class Reference Object");
    }
}
public class EffectOfReference {
    
    public static void main(String[] args) {
        

        A test = new B();

        test.hello();
        test.world();

        
    }
}
