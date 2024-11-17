// Demo.java
public class Demo {
    public static void main(String[] args) {
        // Create an array of Scalable objects
        Scalable[] shapes = new Scalable[4];

        // Add different shapes
        shapes[0] = new Circle(5); // Circle with radius 5
        shapes[1] = new Ellipse(7, 4); // Ellipse with major axis 7 and minor axis 4
        shapes[2] = new Triangle(3, 4, 5); // Triangle with sides 3, 4, 5
        shapes[3] = new EquilateralTriangle(6); // Equilateral Triangle with side 6

        // Print details before scaling
        System.out.println("Before Scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }

        // Scale all shapes by a factor of 2
        scaleShapes(shapes, 2);

        // Print details after scaling
        System.out.println("\nAfter Scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }
    }

    // Static method to scale all objects in the Scalable array
    public static void scaleShapes(Scalable[] scalables, double factor) {
        for (Scalable scalable : scalables) {
            scalable.scale(factor);
        }
    }
}
