abstract class Shape2D {
    private double height;
    private double width;
    private String name;

    public Shape2D(double height, double width)
    {
        this.height = height;
        this.width = width;
    }

    public Shape2D(double height) {
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

    public abstract String getName();
    public abstract double getArea();
}
