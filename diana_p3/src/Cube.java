public class Cube extends Shape3D {
    private double height;

    public Cube(double height)
    {
        super(height);
        this.height = height;
    }

    public String getName()
    {
        return "cube";
    }

    public double getArea()
    {
        return (double)Math.round((height*height*6) * 100) / 100;
    }

    public double getVolume()
    {
        return (double)Math.round(height * height * height * 100) / 100;
    }
}
