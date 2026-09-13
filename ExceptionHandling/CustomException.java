package src.main.java.JavaBasic.ExceptionHandling;

class InsufficentBalance extends Exception{

    private int amount;
      InsufficentBalance(int amount){
         super("\nInsufficent balance.");
         this.amount = amount;
      }
      public int getAmount(){   //it is for e that have inbuild fucntion like this is also we create a e inbuild self build method
        return this.amount;
      }
}

public class CustomException {
    public static void main(String[] args) throws Exception {
        int TotalMoney = 100;
        int WithdrowAmount = 120;

        if(TotalMoney < WithdrowAmount) {
            throw new InsufficentBalance(WithdrowAmount);
        }else{
            TotalMoney-=WithdrowAmount;
            System.out.println("Total amount: "+TotalMoney);
        }

    }
}
