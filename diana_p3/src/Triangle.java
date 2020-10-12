import java.lang.Math;

public class Triangle extends Shape2D{
    private double height;
    private double width;

    public Triangle(double height, double width)
    {
        super(height, width);
        this.height = height;
        this.width = width;
    }

    public String getName()
    {
        return "triangle";
    }

    public double getArea() {
        return (double) Math.round(height*width/2 * 1000) / 1000;
    }
}
