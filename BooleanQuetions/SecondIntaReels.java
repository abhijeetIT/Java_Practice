package main.java.JavaBasic.BooleanQuetions;

public class SecondIntaReels {
    public static void main(String[] args) {
        
        int x = 0;

        System.out.println("======== || operation ==========");

        boolean b = true || ++x > 0 && ++x >0; //The && operator has higher precedence than ||. So Java groups the expression like this
        System.out.println(x);
        System.out.println("Boolean = "+b);
    

        System.out.println("======== | operation ==========");

    
        boolean c = true | ++x > 0 && ++x >0; //it excecute both size

        System.out.println(x);
        System.out.println("Boolean = "+c);
    }
}
