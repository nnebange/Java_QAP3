// Circle.java
public class Circle extends Ellipse {

    // Constructor
    public Circle(double radius) {
        super(radius, radius); // Circle is a special case of Ellipse
        name = "Circle";
    }
}
