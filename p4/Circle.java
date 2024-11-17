// Circle.java
public class Circle extends Ellipse {

    // Constructor
    public Circle(double radius) {
        super(radius, radius); // Circle is a special case of Ellipse
        name = "Circle";
    }

    @Override
    public void scale(double factor) {
        // Scaling is handled by the Ellipse's scale method
        super.scale(factor);
    }
}
