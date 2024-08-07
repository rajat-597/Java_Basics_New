package OopsBasic;

public class ClientExercise {

    public static void main(String[] args) {
        Client [] clients = new Client[2];

        clients[0] = new Client(101, "Rajat", "7205493900");
        clients[0].addAccount(new Account(123, 2300,3.4));
        clients[0].addAccount(new Account(234, 3300,3.2));
        System.out.println(clients[0].toString());

        clients[1] = new Client(201,"Mahesh","8246908730");
        clients[1].addAccount(new Account(345, 4300,2.4));
        clients[1].addAccount(new Account(456, 5300,2.6));
        clients[1].addAccount(new Account(567, 6300,2.8));


        System.out.println(clients[1].toString());





    }
}
