package OopsBasic;

import java.util.ArrayList;

public class Client {

    private int id;
    private String name;
    private String phone;
    private static ArrayList<Account> accounts;

    public Client(int id, String name, String phone){
        this.id = id;
        this.name = name;
        this.phone = phone;

        accounts = new ArrayList<>();
    }
//    static {
//        accounts = new ArrayList<>();
//    }
    public boolean addAccount(Account account){
        accounts.add(account);
        return true;
    }
    public boolean removeAccount(int accountId) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getId() == accountId) {
                accounts.remove(accountId);
                return true;
            }
        }
            return false;
        }

        public String toString(){
        String s = this.id + " " + this.name + " " + this.phone + "\n";

        for(Account account : accounts)
            s = s + account.toString() + "\n";

            return s;
        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

