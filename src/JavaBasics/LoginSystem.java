package JavaBasics;

import java.util.Scanner;

public class LoginSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String correctUserName = "Rajat";
        String correctPassword = "Raj123";

        boolean isloggedIn = false;
        while (!isloggedIn){
            System.out.println("Enter Username");
           String username = sc.nextLine();
           String password = sc.nextLine();

            if (username.equalsIgnoreCase(correctUserName) && password.equals(correctPassword)) {
                System.out.println("Login Successful");
                isloggedIn = true;
            }
            else {
                System.out.println("Please enter correct Username and password");
            }
        }
        sc.close();
    }
}
