// Demo.java
public class Demo {
    public static void main(String[] args) {
        // Create a Point object
        Point p1 = new Point(1.0f, 2.0f);
        System.out.println("Point: " + p1);

        // Modify the coordinates of the Point
        p1.setXY(3.0f, 4.0f);
        System.out.println("Updated Point: " + p1);

        // Create a MovablePoint object
        MovablePoint mp1 = new MovablePoint(5.0f, 6.0f, 1.0f, 1.5f);
        System.out.println("MovablePoint: " + mp1);

        // Move the MovablePoint
        mp1.move();
        System.out.println("Moved MovablePoint: " + mp1);

        // Change the speed and move again
        mp1.setSpeed(0.5f, 0.5f);
        mp1.move();
        System.out.println("Moved MovablePoint with new speed: " + mp1);
    }
}
