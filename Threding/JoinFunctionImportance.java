
public class JoinFunctionImportance extends Thread{

    @Override
    public void run(){
      System.out.println("Run is Method call");
      for(int i=0; i<10; i++){
        System.out.println(i);
      }
    }

    public static void main(String[] args) throws InterruptedException{  //remember and always add InterruptedException in method signature

        JoinFunctionImportance thread = new JoinFunctionImportance();

        thread.start();

        thread.join(); //it help to maintain flow of program , without this the next task of main excevute and thats not good 

        System.out.println("Program ended.........");
    }
}
