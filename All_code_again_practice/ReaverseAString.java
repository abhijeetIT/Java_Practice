package src.main.java.JavaBasic.All_code_again_practice;

public class ReaverseAString {
    public static void main(String[] args) {
        String s1 = "ABHI";
                System.out.println("Before a reverse");
                System.out.println(s1);

        StringBuilder rev = new StringBuilder(s1).reverse();
       
        System.out.println("After a reverse");
        System.out.println(rev);
    }
}
