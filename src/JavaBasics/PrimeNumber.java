package JavaBasics;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        // prime number  -- if it is divisible by 1 and itself . 2, 3 7, 11
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        boolean flag = false;

        for(int i = 2; i <= n/2 ; i++){
            if(n% i == 0){
                flag = true;
                break;
            }
        }
        if(flag != true)
            System.out.println(n + " is a prime number ");
        else
            System.out.println(n + " is not a prime number ");

    }
}
