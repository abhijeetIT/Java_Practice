package main.java.JavaBasic.Strings;

public class LastWordLenght {

    public static int lastWordLenght(String str){
        if(str.length() == 0){
            return -1;
        }

        String[] s = str.split(" ");

        return s[s.length-1].length();
    }

    public static void main(String[] args) {
        
        String s = "Abhijeet    Ka bhai amarjeet   A";

        System.out.println("Length is " +lastWordLenght(s));

    }
}
