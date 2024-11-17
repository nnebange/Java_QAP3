// EquilateralTriangle.java
public class EquilateralTriangle extends Triangle {

    // Constructor
    public EquilateralTriangle(double side) {
        super(side, side, side);
        name = "Equilateral Triangle";
    }

    @Override
    public void scale(double factor) {
        // Scaling is handled by the Triangle's scale method
        super.scale(factor);
    }
}
