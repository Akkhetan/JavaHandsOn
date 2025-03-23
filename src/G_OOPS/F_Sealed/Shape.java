package G_OOPS.F_Sealed;

// Sealed superclass
public sealed abstract class Shape permits Circle, Rectangle {
    public abstract double area();
}