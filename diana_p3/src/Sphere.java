public class Sphere extends Shape3D{
    private double radius;

    public Sphere(double radius)
    {
        super(radius);
        this.radius = radius;
    }

    public String getName()
    {
        return "sphere";
    }

    @Override
    public double getArea() {
        return (double)Math.round((4 * Math.PI * (radius * radius)) * 100) / 100;
    }

    @Override
    public double getVolume() {
        return (double)Math.round((4 * Math.PI * Math.pow(radius, 3))/3 * 100) / 100;
    }
}
