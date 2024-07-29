package JavaBasics;

import java.util.Scanner;

public class Method01 {
    public static void main(String[] args) {

        System.out.println("Enter your name: ");
        System.out.println(getName());
        System.out.println("Enter your age: ");

        System.out.println(getAge());
    }

    public static String getName(){
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        return name;
        // or we can write it in this way as we are using only once

        return new Scanner(System.in).nextLine();
    }

    public static int getAge(){
        return new Scanner(System.in).nextInt();
    }

    public static int getAge(int age){
        return age;
    }
}
