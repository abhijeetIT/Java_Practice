package JavaBasic.OOP;

class Student{
    int age;
    int roll;
    String name;

     Student(String name, int age,int roll){
        this.name=name;
        this.age=age;
        this.roll=roll;
     }
    public void print(){
        System.out.println("Hii "+this.name + " You are "+this.age+" old. your allocated roll number is "+this.roll);
        // System.out.print("Your name is %s.\nYou are now %d year old \n Your allocated roll number is %d.",this.name,this.age,this.roll);
    }
}
public class constructor {
    public static void main(String[] args) {
        Student st1 = new Student("Abhijeet jha",19,266);
        st1.print();    
    }
}
