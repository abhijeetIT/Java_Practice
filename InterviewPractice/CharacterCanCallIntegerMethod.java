package main.java.JavaBasic.InterviewPractice;

public class CharacterCanCallIntegerMethod {
    
public class Main {

    static void show(int x) {
        System.out.println("int");
    }

    static void show(double x) {
        System.out.println("double");
    }

    public static void main(String[] args) {
        show(10);
        show(10.5);
        show('A');
    }
}

}
