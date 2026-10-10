package main.java.JavaBasic.OOP.Abstraction;


 abstract class Vehical{

    public abstract void Weels ();

    public void colour(String Colour){
        System.out.println("Colour");
    }
}



public class AbstractMethod {

    public static void main(String[] args) {
        
    
        Vehical vehical = new Vehical();       // its give compilation error
        vehical.Weels();
        vehical.colour("Red");
    }
}
