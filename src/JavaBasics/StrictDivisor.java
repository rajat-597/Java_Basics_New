package JavaBasics;

import java.util.Scanner;

public class StrictDivisor {

    // 10 -- 1 + 2 + 5 = 8
    // 15 -- 1 + 3 + 5 = 9
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<= num/2; i++){
            if(num% i == 0){
                sum = sum + i;
            }

        }
        System.out.println("sum of strict Divisor of " + num + " is " + sum);

    }
}
