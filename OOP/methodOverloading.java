package src.main.java.JavaBasic.OOP;

public class methodOverloading {

   static class Test {

    void printNumber(Object num){
        System.out.println("Object printed.");
    }
     void printNumber(int num){
        System.out.println("Integer printed.");
    }
    void printNumber(String num){
        System.out.println("String Printed.");
    }
}
    public static void main(String[] args) {

      Test t1 = new Test();
        t1.printNumber(1);
        t1.printNumber("c");
        //so in this case always print who they have perfect in instance like if int available in method it automatic call most sutable Data type
    }
}
