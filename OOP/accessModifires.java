package src.main.java.JavaBasic.OOP;

//IN java here is 3 types of accessModifires

class Account {
       public String name;
       protected String email;
       private String password;
       
       public void printInfo(){
        System.out.println("Name is = "+this.name);
        System.out.println("Email id = "+this.email);
       }
       //getters & satters
       public void setPassword(String pass){
                 this.password=pass;
       }
       public void getPassword(){
        System.out.println("Your password is= "+this.password);
       }
    }

public class accessModifires {
    public static void main(String[] args) {
        Account user1 = new Account();

        user1.email="abhijeet4324@gmail.com";

        user1.name="Abhijeet Jha";

        user1.setPassword("Abhijeet@188333"); 

        user1.printInfo();
        user1.getPassword();
    }
}

/*
 * your cannot access a private variable directly , they can only access and modified in the class methods and the class
 * 
 * her we create setPassword function and print the getPassword function 
 */