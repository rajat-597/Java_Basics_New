package JavaBasics;

import java.util.Scanner;

public class Pattern02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        for (int i = 1;i<=n; i++){
            for(int sp = n; sp>=i; sp--){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
