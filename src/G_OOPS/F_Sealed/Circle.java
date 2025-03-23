package G_OOPS.F_Sealed;

// Final subclass (cannot be extended further)
public  final class Circle extends Shape {
    public final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}