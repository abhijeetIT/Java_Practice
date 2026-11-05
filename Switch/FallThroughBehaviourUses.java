package main.java.JavaBasic.Switch;

public class FallThroughBehaviourUses {
    public static void main(String[] args) {
        char grade = 'B';

switch (grade) {
    case 'A':
    case 'B':
    case 'C':
        System.out.println("Pass");
        break;

    case 'D':
    case 'F':
        System.out.println("Fail");
        break;
}
    }
}
