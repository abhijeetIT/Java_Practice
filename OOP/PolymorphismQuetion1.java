package main.java.JavaBasic.OOP;


class A {

    public void person(){
        System.out.println("Without parameter");
    }

    public void person(String name, int age){
        System.out.println("2 parameter");
    }

    public void person(int age, String name){
        System.out.println("interchange type of prameter");
    }
    
}

public class PolymorphismQuetion1 {

    public static void main(String[] args) {
        
        A a = new A();

        a.person();
        a.person("Abhijeet", 21);
        a.person(21,"Abhijeet");

    }
    
}
