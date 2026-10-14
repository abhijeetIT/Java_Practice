package main.java.JavaBasic.OOP.Inheritance;


class X{

}class Y extends X{

}class Z extends Y{

}

public class WhichClassCalled {
    
    static void m1(X x){
        System.out.println("One");
    }
    static void m1(Y y){
        System.out.println("Two");
    }

    static void m1 (Object obj){
        System.out.println("Threee");
    }

    public static void main(String[] args) {
        Z z = new Z();

        m1(z);

    }


}
