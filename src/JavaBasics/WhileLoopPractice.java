package JavaBasics;

import java.util.Scanner;

public class WhileLoopPractice {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 10: ");
        int num = userInput.nextInt();
        if(num <=1 || num >= 10) {
            System.out.println(num + " is not between 1 and 10. Try again!");
        }
        int i = 1;
        while(i <= 10) {
            if (num == i) {
                System.out.println(num + " is in between 1 and 10 Thanks !");
                break;
            }
            i++;
        }
    }
}
