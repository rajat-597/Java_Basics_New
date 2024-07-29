package JavaBasics;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {

        String name = "Rajat";
        String name1 = name.toLowerCase();
        System.out.println(name1);
        System.out.println(name);

        String companyName = "Clairvoyant";
        System.out.println(companyName.charAt(4));
        System.out.println(companyName.indexOf('v'));

        int a = 10;
        System.out.println(a);

        int b = a + 5;
        a = b;
        System.out.println(b);
        System.out.println(a);

        // Scanner class demo
//       Scanner input = new Scanner(System.in);
//        int number = input.nextInt();
//        System.out.println("Enter your favourite Integer: " + number);
//        System.out.println(number + " is my favourite integer too!");

        // Enter your name and Age

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your name and Age ");
//      String name3 =   input.next();
//        int age = input.nextInt();
//        System.out.println(name3 + "! you are "+ age + " years old");

//    Coditinal operator
        String name4 = "Rajat Kumar Sahoo";
        System.out.println(((name.isEmpty()) ? "Print the name" : name4));

        // switch statements

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number : ");
//        switch (input.nextInt()%2){
//            case 0 :
//                System.out.println("Even number");
//                break;
//            case 1:
//                System.out.println("odd number");
//                break;
    }
    }

