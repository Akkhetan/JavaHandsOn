package G_OOPS.F_Sealed;

public class RectangleChild extends Rectangle{

    public final double length;
    public final double width;

    public RectangleChild(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}