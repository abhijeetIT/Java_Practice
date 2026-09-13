package src.main.java.JavaBasic.ExceptionHandling;

public class ConditionTest1 {

    public static String process(){
        try{
            System.out.println("try");
            throw new Exception("Eception comes");
        }catch(Exception e){
            System.out.println("Catch block");
            return "catch return";
        }finally{
         System.out.println("all return");
         return "finally";
        }
    }
    public static void main(String[] args) {
        
      System.out.println(process());
    }
}
