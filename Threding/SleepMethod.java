package main.java.JavaBasic.Threding;

public class SleepMethod extends Thread{

    @Override 
    public void run(){
       for(int i=1; i <= 5;i++){
        try{
        Thread.sleep(2000);
        }catch(Exception e){
            System.out.println(e.getLocalizedMessage());
        }

        System.out.println(i);
       }
    }
    
    public static void main(String[] args) {

        SleepMethod thread = new SleepMethod();
        thread.start();
    }
}
