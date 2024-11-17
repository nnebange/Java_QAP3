public class Point {
    private float x; // x-coordinate
    private float y; // y-coordinate

    // Default constructor
    public Point() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    // Constructor with parameters
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getters and setters for x and y
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    // Method to set both x and y
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Method to get x and y as an array
    public float[] getXY() {
        return new float[]{x, y};
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
