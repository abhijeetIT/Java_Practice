package main.java.JavaBasic.OOP.Encapculation;

public class AbhijeetString {
    final private String abhijeeString;
    AbhijeetString(String string){
          abhijeeString=string;
    }

    AbhijeetString(){
        abhijeeString=null;
    }
    public String getAbhijeetString(){
        return abhijeeString;
    }

    public int Length(){
        return this.abhijeeString.length();
    }

    @Override
    public String toString() {
        return abhijeeString;
    }
}
