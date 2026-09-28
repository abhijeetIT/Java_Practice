package main.java.JavaBasic.Strings;

public class Quetion1 {
    public static void main(String[] args) {
        String a = "Java";
String b = "Java";
String c = new String("Java"); //new String() explicitly creates a new String object.

System.out.println(a == b);
System.out.println(a == c);
System.out.println(a.equals(c));
    }
}
