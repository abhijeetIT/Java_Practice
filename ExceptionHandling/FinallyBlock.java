package main.java.JavaBasic.ExceptionHandling;

public class FinallyBlock {


    public static int practice(){
        
        try{
            System.out.println("IM try");
            return 10;
        }catch(Exception e){
            return 20;
        }finally{
            System.out.println("Im the boss");
            return 30;
        }
    }
    public static void main(String[] args) {
        
        System.out.println(practice());
    }
}
