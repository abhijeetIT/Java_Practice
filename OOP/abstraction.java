package JavaBasic.OOP;

/*I.M.P 
 * 1- An abstract class must be declared with an abstract keyword
 * 2- It can have abstract and non-abstract mehods
 * 3- It cannot be instantiated
 * 4- It can have constructors and Static methods also.(firstly Base class contructer run)
 */




// after assign the abstact the class cannot use as bluePrint 
abstract class Animal {
  public void walk(){  //after assign a abstract these method not working (we also add a 'abstract' in the starting of method)
        
   }
}

class Horse extends Animal {
    public void walk(){
        System.out.println("Walks on 4 legs!!");
    }
    
}
class Chikean extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs!!");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();

        // Animal animal = new Animal(); 
        // animal.walk();
    } 
}


