package OopsBasic;

public class AccountExercise {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000, 4.5);
        account.withdrawn(10000);
        account.deposit(5935.29);
        System.out.println(account.getId() + " " +
                account.getBalance() + " " +
                account.getAnnualInterestRate() + " " +
                account.getDateCreated().toString());
    }
}
