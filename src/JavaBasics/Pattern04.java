package JavaBasics;

import java.util.Scanner;

public class Pattern04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i -1; j++) {
                if (i == n) {
                    System.out.print("*");
                } else
                    if (j == 1 || j <= (2*i)- 1) {
                    System.out.println("*");
                } else {
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}

