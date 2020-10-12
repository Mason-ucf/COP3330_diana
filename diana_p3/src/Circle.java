import java.lang.Math;

public class Circle extends Shape2D{
    private double radius;

    public Circle(double radius)
    {
        super(radius);
        this.radius = radius;
    }

    public String getName()
    {
        return "circle";
    }

    public double getArea() {
        return (double)Math.round((Math.PI * (radius * radius)) * 100) / 100;
    }
}
