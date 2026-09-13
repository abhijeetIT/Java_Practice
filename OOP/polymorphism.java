package JavaBasic.OOP;


class User{
      String name;
      int age;
      String gender;

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String gender,int age,String name){
        System.out.println("Your name is "+name+".\n your age is "+age+" your gender is.\n "+gender);
    }
}

public class polymorphism {
    public static void main(String[] args) {
        
    User user1= new User();
    user1.printInfo(19);
    user1.printInfo("Abhijeet jha");
    user1.printInfo("Male", 19, "Abhijeet jha");
    }
}

/*A polymorphism is a same name method that are define under the class.
 * it has 2 types 1-Runtime 
 * 2-compile time means it cheak if the calling part hase same return type or same data type parameter so that mached fucntion under class called.
 */