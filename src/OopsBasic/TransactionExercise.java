package OopsBasic;

import java.util.ArrayList;

public class TransactionExercise {

    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();

        // Each Account is associated with the Clients
        Client client = new Client(101, "Rajat", "1234567890");

        // Add accounts to Arraylist
        accounts.add(new Account(1122,3000,4.5));
        accounts.add(new Account(1133,5000,5.0));

        accounts.get(0).deposit(1000);
        accounts.get(0).withdrawn(1500);

        accounts.get(1).withdrawn(450);
        accounts.get(1).deposit(1200);
        accounts.get(1).withdrawn(500);

        System.out.println(accounts.get(0));

//        for(Account account : accounts){
//            System.out.println("Account : " + account.getId());
//            System.out.println("Withdrawn : "+ account.getTransactionCount('W'));
//            System.out.println("Deposit : "+ account.getTransactionCount('D'));
//        }



    }
}
