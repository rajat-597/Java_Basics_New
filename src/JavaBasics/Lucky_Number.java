package JavaBasics;

import java.util.Scanner;

public class Lucky_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = sc.nextInt(); // 3719
        int num = number;
        int n1 = num%10;
        System.out.println(n1);
        System.out.println(num);
        num = num/10;
        int n2 = num%10;
        System.out.println(n2);
        System.out.println(num);
        num = num/10;
        int n3 = num%10;
        System.out.println(n3);
        System.out.println(num);
        num = num/10;
        int n4 = num%10;
        System.out.println(n4);
        System.out.println(num);

        if((n1+n2) == (n3+n4))
            System.out.println(number + " is lucky number");
        else
            System.out.println(number + " not  lucky number");


    }
}
