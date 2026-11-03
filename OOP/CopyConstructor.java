package main.java.JavaBasic.OOP;

public class CopyConstructor {

    static class A {
        String name;

        A(){
            
        }
        A(A a){
         this.name = a.name;
        }
    }
    public static void main(String[] args) {
        A a = new A();
        a.name = "Abhijeet";
        System.out.println(a.name);

        A abc = new A(a);
        System.out.println(abc.name);
    }
}
