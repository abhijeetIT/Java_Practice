package src.main.java.JavaBasic.OOP;

public class FechingAccessModifires {
    public static void main(String[] args) {
        Account ac = new Account();

        String email = ac.email; //protected within package its acceble
        // String pass = ac.password //private thats why cannot access outside the file
        
    }
}
