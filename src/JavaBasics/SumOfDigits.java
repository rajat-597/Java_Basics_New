package JavaBasics;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        // 123 -- 1+2+3 = 6
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int i =1;
        while(num>=i){
           int res = num%10;
            System.out.println("Result is " + res);
            sum = sum +res;
            System.out.println("sum is " + sum);
            num  = num/10;
            System.out.println("number is "+ num);
        }
        System.out.println("sum of number is " + num );
    }
}
