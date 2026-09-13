package src.main.java.JavaBasic.OOP;

public class MethodOverriding {
    static class Pay{
        void pay(){System.out.println("Please make payment..");};
    }
    static class Cash extends Pay{
        Cash(){

        }
        void pay(){
            System.out.println("Payment done by \"Case\"");
        }
    }
    static class UPI extends Cash{
         void pay(){
            System.out.println("Payment done by \"Upi\"");
        }
    }
    static class Card extends UPI{
        void pay(){
            System.out.println("Payment done by \"Debit/Credit Card\"");
        }
    }
    static class NetBanking extends Card{
          void pay(){
            System.out.println("Payment done by \"Net Banking\"");
        }
    }

    public static void main(String[] args) {
        Pay pay = new Pay();
        pay.pay();

        Cash cash = new Cash();
        cash.pay();

        UPI upi = new UPI();
        upi.pay();


        Card card = new Card();
        card.pay();

        NetBanking netBanking = new NetBanking();
        netBanking.pay();    
    }
}
