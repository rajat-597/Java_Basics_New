package JavaBasics;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {

        // 1 1 2 3 5 8 13 ... (Addition of last two number)
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number ");
        int n = sc.nextInt();
        int num = n;
        int a =1, b = 1;
        int c ;
        System.out.print( a + " " + b + " ");
        while (n>2){
            c = a+b;
            a = b;
            b = c;
            n--;
            System.out.print(c + " " );
        }

    }
}
