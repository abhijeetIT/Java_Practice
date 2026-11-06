package main.java.JavaBasic.Strings;

public class LastWordLenght {
 // public static int lastWordLenght(String str){
    //     if(str.length() == 0){
    //         return -1;
    //     }

    //     String[] s = str.split(" ");

    //     return s[s.length-1].length();
    // }

    public static int lastWordLenght(String str){
        if(str.length() == 0){
            return -1;
        }

        int length = 0;

        int i = str.length()-1;

        while(i >=0 && str.charAt(i) == ' '){
            i--;
        }

        while (i >=0 && str.charAt(i) != ' ') {
            length++;
            i--;
        }
   
        return length;
    }
    
    public static void main(String[] args) {
        
        String s = "Abhijeet    Ka bhai amarjeet   A";

        System.out.println("Length is " +lastWordLenght(s));

    }
}
