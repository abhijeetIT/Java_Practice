package src.main.java.JavaBasic.OOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Bank{
    static String greeting="Thank You for using \"Kotak 811 !\" ";
    String name;
    int amount;

    Bank()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter a Name: ");
        this.name=br.readLine();

        System.out.print("Enter a balance to add: ");
        this.amount=Integer.parseInt(br.readLine());
    }

    public void Debit(int amt){
        if(this.amount >= amt){       
            this.amount = this.amount- amt;

            System.out.println("Dear Kotak 811 user, Your account Debited= "+amt+".\nYour current balance is= "+this.amount);
        }else{
            System.out.println("You have insuffisant balance!\n Current Balance is="+this.amount);
        }
        System.out.println();
    }
    public void Credit(int amt){
       this.amount+=amt;
       System.out.println("Dear Kotak 811 user, Your account Credited= "+amt+".\nYour current balance is= "+this.amount);
       System.out.println();
    }
    public void display(){
        System.out.println(Bank.greeting);
        System.out.println("Name= "+this.name);
        System.out.println("Balance= "+this.amount);
        System.out.println();
    }
}

public class bankingSystem {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{

            Bank user1 = new Bank();
    
                 System.out.print("Enter amount to send: ");
                int deb_amt = Integer.parseInt(br.readLine());

                 user1.Debit(deb_amt);

                 System.out.print("Enter a amount you want to deposite: ");
                 user1.Credit(Integer.parseInt(br.readLine()));
               user1.display();
        
    }
}