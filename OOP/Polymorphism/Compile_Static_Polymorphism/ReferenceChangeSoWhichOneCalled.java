package main.java.JavaBasic.OOP.Polymorphism.Compile_Static_Polymorphism;


class A{
    void print(){
        System.out.println("A mehod");
    }

    void print(String str){
        System.out.println("A method "+str);
    }
}

class B extends A{
    // void print(){
    //     System.out.println("B method call");
    // }

}

public class ReferenceChangeSoWhichOneCalled {
    public static void main(String[] args) {
        
        /* 
        //this only calls A class method
        A a = new A();

        a.print("Abhijeet");
        a.print();
        */

        /* 
        //This only calls A method and B method if method have in B
        A a = new B();

        a.print(); // B Call -> becouse b have a same print() method
        a.print("Abhijeet");
        */
    }
}
