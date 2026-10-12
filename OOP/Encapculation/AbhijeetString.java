package main.java.JavaBasic.OOP.Encapculation;

public class AbhijeetString {
    final private String abhijeeString;
    AbhijeetString(String string){
          abhijeeString=string;
    }

    public String getAbhijeetString(){
        return abhijeeString;
    }

    public int Length(){
        return this.abhijeeString.length();
    }
}
