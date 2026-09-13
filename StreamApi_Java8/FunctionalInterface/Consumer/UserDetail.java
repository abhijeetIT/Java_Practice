package src.main.java.JavaBasic.StreamApi_Java8.FunctionalInterface.Consumer;

import java.util.function.Consumer;

public class UserDetail {
    
    static class User{
        String name;
        String Age;

        User(String name,String age){
            this.name = name ;
            this.Age = age;
    }
    Consumer<User> printUser = (User u)->System.out.println("User name is: "+u.name+"\nUser age is : "+u.Age);

}
    // static Consumer<User> printUser = (User u)->System.out.println("User name is: "+u.name+"\nUser age is : "+u.Age);

    public static void main(String[] args) {
        // Consumer<User> printUser = (User u)->System.out.println("User name is: "+u.name+"\nUser age is : "+u.Age);

        User u = new User("Abhi", "12");

            u.printUser.accept(u);
    }
}