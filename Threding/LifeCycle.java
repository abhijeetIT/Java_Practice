package main.java.JavaBasic.Threding;

public class LifeCycle extends Thread{

    @Override
    public void run(){
      System.out.println("Run is RUUNNING");
      System.out.println("In run method state is = "+Thread.currentThread().getState());
    }

    

    public static void main(String[] args) {

        LifeCycle thread = new LifeCycle();

        System.out.println(thread.getState()); //thread created OUTPUT: NEW

        thread.start(); //starting run method

        System.out.println(thread.getState()); 

    }
}
