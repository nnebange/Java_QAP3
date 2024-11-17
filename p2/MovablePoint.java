// MovablePoint.java
public class MovablePoint extends Point {
    private float xSpeed; // Speed in the x direction
    private float ySpeed; // Speed in the y direction

    // Default constructor
    public MovablePoint() {
        super(); // Calls the default constructor of Point
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    // Constructor with parameters
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y); // Calls the constructor of Point
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Getters and setters for xSpeed and ySpeed
    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    // Method to set both xSpeed and ySpeed
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Method to get xSpeed and ySpeed as an array
    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    @Override
    public String toString() {
        return super.toString() + ", speed=(" + xSpeed + ", " + ySpeed + ")";
    }

    // Method to move the point by its speed
    public MovablePoint move() {
        setX(getX() + xSpeed); // Use getters and setters from the Point class
        setY(getY() + ySpeed); // Use getters and setters from the Point class
        return this;
    }
}
