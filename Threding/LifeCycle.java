package main.java.JavaBasic.Threding;

public class LifeCycle extends Thread{

    @Override
    public void run(){
      System.out.println("Run is Method call");
      System.out.println("In run method state is = "+Thread.currentThread().getState());
    }

    

    public static void main(String[] args) {

        LifeCycle thread = new LifeCycle();

        System.out.println("17   "+thread.getState()); //thread created OUTPUT: NEW

        thread.start(); //starting run method

        System.out.println("21   "+thread.getState()); 

    }
}
