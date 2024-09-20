package JavaBasics;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc =new Scanner(System.in);

        int targetNumber = random.nextInt(100) + 1; // range will be from 1 to 100
        System.out.println("Check the Random value " + targetNumber);

        int guess = 0;
        boolean hasCorrectlyGuessed = false;

        while (!hasCorrectlyGuessed){
            System.out.println("Enter your guess from 1 to 100 ");
            guess = sc.nextInt();
            if(guess < targetNumber){
                System.out.println("Too low !! Try Again ");
            } else if (guess > targetNumber) {
                System.out.println("Too high !! Try Again ");
            } else {
                System.out.println("Congratulations !! We hav the match ");
                hasCorrectlyGuessed = true;
            }
        }
        sc.close();
    }
}
