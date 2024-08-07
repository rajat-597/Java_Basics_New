package OopsBasic;

import java.awt.*;

public class Circle {

    Point centre;  // here Point is a class.
    double radius;

    public double getAreaOfCircle(){
        return 3.14*radius*radius;
    }

    public double getPerimeterOfCircle(){
        return 2*3.14*radius;
    }

    public void setCentre(Point c){
    this.centre = c;
        System.out.println("value of c:  " + this.centre);
    }

    public void setRadius(double r){
        this.radius = r;
    }
}
