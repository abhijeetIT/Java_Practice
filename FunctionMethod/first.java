package JavaBasic.FunctionMethod;

public class first {
    public static void printJava(){
        System.out.println("I love you so much:)!!");
    }

    public static void printUser(String name){
        System.out.println("Whelcome "+name);
    }
    public static void main(String[] args) {
        for(int i=0;i<3;i++){
            printJava();
        }
        printUser("Abhijeet");
    }
}
