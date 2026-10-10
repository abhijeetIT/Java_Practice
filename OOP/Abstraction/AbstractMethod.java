package main.java.JavaBasic.OOP.Abstraction;

abstract class Vehical{

     abstract void Weels ();

    public void colour(String Colour){
        System.out.println("Colour");
    }
}
  class Bike extends Vehical{

    @Override
    public void Weels() {
        System.out.println("A bike has 2 wheels");
    }
}

public class AbstractMethod {

    public static void main(String[] args) {
        
    
     /* Vehical vehical = new Vehical();       // its give compilation error becouse we cannot create the abstract class OBJECT

        vehical.Weels();
        vehical.colour("Red");
    */ 

        //its all valid becouse vehical ingeritade by Bike

        Bike bike = new Bike();

        bike.Weels();
        bike.colour("Red");
        
    }
}
