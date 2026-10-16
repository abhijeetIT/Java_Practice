package main.java.JavaBasic.OOP.Polymorphism.Runntime_Dynamic_Polymorphism;


class Parent{

    void show(String object){
        System.out.println("Parent");
    }
}

class Child extends Parent{

    void show(String str){
        System.out.println("Child");
    }
}

public class ChildMethodCalled {
    public static void main(String[] args) {
        Parent child = new Child();

        child.show("Abhi");
    }

}
