package JavaBasic.OOP;


class Family {
        public void printFamily(){
                    System.out.println("I am the Jha family member!");
        }
} 
class Beta1 extends Family{
        public void printMyName(){
            System.out.println("My name is Abhijeet!!");
        }
}
class Beta2 extends Beta1{
    public void printBeta2(){
        System.out.println("My name is Amarjeet!!");
    }
}


public class inheritance {
    public static void main(String[] args) {
        Beta1 abhi = new Beta1();
        abhi.printFamily();
        abhi.printMyName();
    }
}
