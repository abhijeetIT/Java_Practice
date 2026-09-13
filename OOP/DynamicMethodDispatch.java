package src.main.java.JavaBasic.OOP;

public class DynamicMethodDispatch {
    static class A{
        void show(){
            System.out.println("Class Method: A ");
        }
    }
    static class B extends A{
        void show(){
            System.out.println("Class Method: B ");
        }
    }

    public static void main(String[] args){
    
    //situations

        //1.All good
        // A obj = new A();
        // obj.show(); // A show run

        //2. A reference , B object
        // A obj = new B();
        // obj.show(); //Output : B Show run

        //3. B reference , A Object
        // B obj = new A(); // show error

        
         
    }
}
