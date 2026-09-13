package JavaBasic.ExceptionHandling;

public class first {
    public static void main(String[] args) {
        int[] marks={1,2,3,4};
        try{
            // System.out.println(marks[1]);
            System.out.println(marks[5]);
        }catch(Exception exception){
            // System.out.println(Exception);
            System.err.println("These is after handling!");
        }
        
    }
}
