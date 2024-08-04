package JavaBasics;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList02 {

    // Create a menu program for following option
   //  1. Add 2. Remove 3. Display 4. Exit . it will run infinitely until users enter option 4

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        Scanner input = new Scanner(System.in);


        for(int i=1; true ; i++ ){
            System.out.println("1. Add");
            System.out.println("2. Remove");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.println("Enter your Choice");
            int n = input.nextInt();
            System.out.println("Your Choice: " + n);
            if(n == 1) {
                al.add(input.nextInt());
                System.out.println("Added");
            }
             else if (n == 2){
                System.out.println("Enter the Element to be removed ");
                int numberToRemove = input.nextInt();
                if(al.contains(numberToRemove)) {
                    al.remove(Integer.valueOf(numberToRemove));
                    System.out.println("Removed");

                }
                else
                    System.out.println("Not Found");

            }
            else if (n == 3) {
                System.out.println("Your List : " + al);

            }
            else if (n == 4){
                System.out.println("Bye");
                break;
            }
        }


    }
}
