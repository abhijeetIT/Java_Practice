package src.main.java.JavaBasic.StreamApi_Java8.Lambda_Function;

public class Add2Numbers {
    
    @FunctionalInterface
    public interface InnerAdd2Numbers {
           void add(int a,int b);
        //    void no(int c,int d); // in case of interface having more than one method it will throw an error
    }

    public static void main(String[] args) {
        InnerAdd2Numbers math = (a,b)->{System.out.println(a+b);
        };
        math.add(10,400);
    }
}
