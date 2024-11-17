// Ellipse.java
public class Ellipse extends Shape {
    private double majorAxis; // a
    private double minorAxis; // b

    // Constructor
    public Ellipse(double axis1, double axis2) {
        super("Ellipse");
        if (axis1 > axis2) {
            this.majorAxis = axis1;
            this.minorAxis = axis2;
        } else {
            this.majorAxis = axis2;
            this.minorAxis = axis1;
        }
    }

    @Override
    public double getArea() {
        return Math.PI * majorAxis * minorAxis;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * (2 * (majorAxis + minorAxis) - Math.pow(majorAxis - minorAxis, 2) / (2 * (majorAxis + minorAxis)));
    }

    @Override
    public void scale(double factor) {
        majorAxis *= factor;
        minorAxis *= factor;
    }
}
