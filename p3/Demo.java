// Demo.java
public class Demo {
    public static void main(String[] args) {
        // Create an array of Shape objects
        Shape[] shapes = new Shape[4];

        // Add different shapes
        shapes[0] = new Circle(5); // Circle with radius 5
        shapes[1] = new Ellipse(7, 4); // Ellipse with major axis 7 and minor axis 4
        shapes[2] = new Triangle(3, 4, 5); // Triangle with sides 3, 4, 5
        shapes[3] = new EquilateralTriangle(6); // Equilateral Triangle with side 6

        // Print details of all shapes
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
