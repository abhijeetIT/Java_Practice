package src.main.java.JavaBasic.OOP;

public class PassByValuePrimitiv {

    static void test(int x){
        System.out.println("Before value changing in function The value of X is: "+x);
        x=10;
        System.out.println("after value changing in function , the value of x is : "+x);

    }

    public static void main(String[] args) {
        int x= 5;

        System.out.println("Before fucntion call X value in MAIN : "+x);
        test(x);
         System.out.println("After fucntion call X value in MAIN  "+x);
    }
}
