package OopsBasic;

import java.util.Scanner;

public class RectangleExercise {

    // create an array of 3 rectangle read from the keyboard, then print the attribute of each rectangle.
    public static void main(String[] args) {
//        Rectangle r1 = new Rectangle(3,4);
//        Rectangle r2 = new Rectangle(2,4);
//        Rectangle r3 = new Rectangle(5,7);
//
//        Rectangle[] r = {r1, r2, r3 };
//
//        for (int i = 0; i<3; i++){
//            //System.out.println(r[i]);
//            System.out.println("Area of r" + (i+1) + " " + r[i].getArea());
//            System.out.println("Perimeter of r" + (i+1) + " " + r[i].getArea());
//
//        }

        // other approach

        Rectangle[] rectangles = new Rectangle[3]; // null null null
        ReadRectangle(rectangles);
        printRectangle(rectangles);

    }

    public static void ReadRectangle(Rectangle[] rectangles) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < rectangles.length; i++) {
            System.out.println("Do you want to enter width and height? (y/n): ");
            char choice = sc.next().charAt(0); // get char input from users
            if (choice == 'y') {
                rectangles[i] = new Rectangle(sc.nextDouble(), sc.nextDouble());
            } else
                rectangles[i] = new Rectangle();
        }
    }

    public static void printRectangle(Rectangle[] rectangles){
        System.out.println("The Rectangles are : ");
        for (int i = 0; i < rectangles.length; i++) {
            System.out.println("Rectangle " + (i + 1) + "Width : " + rectangles[i].getWidth()

                    + "height : " + rectangles[i].getHeight());
        }
    }
}



