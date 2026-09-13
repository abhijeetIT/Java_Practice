package src.main.java.JavaBasic.OOP;


public class PassByValue {

    static class Student{
    int x;
}

    public static void test(Student s){
        System.out.println("s in fucntion before value change : "+s.x);
        s.x = 20;
        System.out.println("s After value change in function: "+s.x);
    }
    
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.x=10;
        System.out.println("s1 The value before call: "+s1.x);
        test(s1);
        System.out.println("s1 after function call the value : "+s1.x);
    }
}
