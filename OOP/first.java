package src.main.java.JavaBasic.OOP;

class Car {
  int  wheel=4;
  String color;
  int model;

  public void print(){
    System.out.println("colore of your care is : "+this.color);
    System.out.println("the model is : "+this.model);
    System.out.println("Car hase total wheel of: "+this.wheel);
  }
    
}

public class first {
    public static void main(String[] args) {
        Car Oudi=new Car();
        Oudi.color="Black";
        Oudi.model=3;
        Oudi.print();
    }
}
