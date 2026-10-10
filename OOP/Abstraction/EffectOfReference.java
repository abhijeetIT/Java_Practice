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
        

        System.out.println();
        System.out.println("====================Testing A type Reference ======================");
        A testA = new B();  // A reference cannot access B class exclusive Method

        testA.hello();
        testA.world();
        testA.Exclusive_A_Class_Method();

        B testB = new B();
        System.out.println();
        System.out.println("====================Testing B type Reference ======================");
        testB.hello();
        testB.world();
        testB.Exclusive_A_Class_Method();  //if extends so it use A class method
        testB.Exclusive_B_Class_Method();
        
    }
}
