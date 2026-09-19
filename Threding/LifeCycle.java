package main.java.JavaBasic.Threding;

public class LifeCycle extends Thread{

    @Override
    public void run(){
      System.out.println("Run is RUUNNING");
    }

    

    public static void main(String[] args) {

        LifeCycle thread = new LifeCycle();
        System.out.println(thread.getState());
    }
}
