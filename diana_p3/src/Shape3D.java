public abstract class Shape3D {
    private double height;
    private double width;
    private double base;
    private String name;

    public Shape3D(double height, double width, double base)
    {
        this.height = height;
        this.width = width;
        this.base = base;
    }

    public Shape3D(double height)
    {
        this.height = height;
    }

    public double getHeight()
    {
        return height;
    }

    public double getWidth()
    {
        return width;
    }

    public double getBase()
    {
        return base;
    }


    public abstract String getName();
    public abstract double getArea();
    public abstract double getVolume();
}
