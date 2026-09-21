package main.java.JavaBasic.ExceptionHandling;

public class FinallyBlock {


    public static int practice(){
        
        try{
            return 10;
        }catch(Exception e){
            return 20;
        }finally{
            return 30;
        }
    }

    public static void main(String[] args) {
        
        System.out.println(practice());
    }
}
