package JavaBasics;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercise01 {
    public static void main(String[] args) {
        // enter a number b/w 1 to 20 only and  fill the array with that number

        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // to get the number b/w 1 to 20 from the users
        while(n>20 || n<1)
        {
            System.out.println("please Enter the valid range ");
            n = sc.nextInt();
        }

        // insert n element to array
        insertElement(new int[n]);

    }
    public static void insertElement(int[] num){
        System.out.println("Insert the element to the array");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i< num.length;i++){
            num[i] = sc.nextInt();
        }
        System.out.print(Arrays.toString(num));
    }
}
