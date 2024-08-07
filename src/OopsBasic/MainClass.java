package OopsBasic;

import java.awt.*;

public class MainClass {

    public static void main(String[] args) {
        Circle c = new Circle();
       // c.centre = new Point(3,5);
       // System.out.println(c.centre);
       // c.radius = 5;
        c.setCentre(new Point(3,4));
        c.setRadius(4.0);
        System.out.println(c.getAreaOfCircle());
        System.out.println(c.getPerimeterOfCircle());
    }
}
