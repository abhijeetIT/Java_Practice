package src.main.java.JavaBasic.StreamApi_Java8.Lambda_Function;

public class FirstLambda {
    public static void main(String[] args) {
        Runnable r = () ->{ System.out.println("hii");};

        r.run();
    }
}
