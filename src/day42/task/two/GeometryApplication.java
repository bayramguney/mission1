package day42.task.two;

// create base class Shape add attributes
// create two subclass as Circle and Rectangle

import java.util.ArrayList;

// Shape: color, filled
// Circle: radius
// Rectangle: width, length
public class GeometryApplication {

    public void createSomeShapes() {
        Circle circle = new Circle();
        circle.setRadius(10.0);
        circle.setColor("Green");
        circle.setFilled(true);

        Rectangle rectangle = new Rectangle("Yellow", true, 5, 3);
    }
}
