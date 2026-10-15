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
    void print(){
        System.out.println("B method call");
    }

}

public class ReferenceChangeSoWhichOneCalled {
    public static void main(String[] args) {
        
        A a = new A();

        a.print("Abhijeet");
        a.print();
    }
}
