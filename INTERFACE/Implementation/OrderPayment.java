package src.main.java.JavaBasic.INTERFACE.Implementation;

import src.main.java.JavaBasic.INTERFACE.Payment;

 class CreditCard implements Payment{

        @Override
        public void pay(Double Amount,Integer orderId) {
            System.out.println("Pay via CreditCard, Amount= "+Amount+" for order id "+orderId);
        }
    }

 class Upi implements Payment{
    @Override
        public void pay(Double Amount,Integer orderId) {
            System.out.println("Pay via UPI, Amount= "+Amount+" for order id "+orderId);
        }
 }

public class OrderPayment {

    
    public static void main(String[] args) {
        
        CreditCard cc = new CreditCard();
        cc.pay(12.00,1);

        Upi upi= new Upi();
        upi.pay(1299.00,2);
    }
}
