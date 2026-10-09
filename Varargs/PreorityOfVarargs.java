package main.java.JavaBasic.Varargs;


public class PreorityOfVarargs {



    public static void test(int... args){
           System.out.println("A method have only one var args argument");
}

    public static void test(int a, int... args){
           System.out.println("Varargs only in last argument");
}

    public static void test(int... args, int arr){
           System.out.println("Its throw a error");
}


public static void main(String[] args) {
    

}
}