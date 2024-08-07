package OopsBasic;

import java.util.ArrayList;
import java.util.Date;

public class Account {

   private int id;
   private double balance;
   private double annualInterestRate;
   private static Date dateCreated;
   private Client client;   // Account holder
   private ArrayList<Transaction> transactions; // we will store D and W for each transaction here

   public Account(int id, double balance, double annualInterestRate){
       this.id = id;
       this.balance = balance;
       this.annualInterestRate = annualInterestRate;

       dateCreated = new Date();
       transactions = new ArrayList<>();

   }
   public boolean withdrawn(double amountToBeWithdrawn){
       if(this.balance< amountToBeWithdrawn) {
           System.out.println("insufficient Balance");
           return false;
       }
       else {
           this.balance = this.balance - amountToBeWithdrawn;
           this.transactions.add(new Transaction('W',amountToBeWithdrawn, balance, "Withdrawn" ));
           System.out.println("Balance after withdrawn : " + balance);
           return true;
       }
   }
   public void deposit(double amountToBeCredited ){
           this.balance = this.balance + amountToBeCredited;
          this.transactions.add(new Transaction('D', amountToBeCredited, balance, "Deposited"));
          System.out.println("Amount after credit " + balance);
   }

   public int getTransactionCount(char type){
       int count = 0;
       for(Transaction transaction: transactions)
           if(transaction.getType() == type)
               count++;

       return count;
   }
    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static Date getDateCreated() {
        return dateCreated;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public String toString(){
       return  this.id + " " + this.balance + " " + this.annualInterestRate + this.getDateCreated() + transactions + " \n";
    }
}
