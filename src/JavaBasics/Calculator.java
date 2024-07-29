package JavaBasics;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2 :");
        int num2 = sc.nextInt();
        System.out.println("Enter the operation name");
        char op = sc.next().charAt(0); // to print the charector
        if (op == '+')
        System.out.println(" sum of two numbers " + (num1+num2));
        else if (op == '-')
            System.out.println(" Subtraction of two numbers " + (num1-num2));
        else if (op == '*')
            System.out.println(" Multiplication of two numbers " + (num1*num2));
        else if (op == '/')
            System.out.println(" Division of two numbers " + (num1/num2));
        else if (op == '%')
            System.out.println(" Remainder of two numbers " + (num1%num2));
        else
            System.out.println("Invalid operation");


        }

    }

