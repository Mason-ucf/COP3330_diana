public class Pyramid extends Shape3D{
    private double height;
    private double width;
    private double base;

    public Pyramid(double base, double width, double height)
    {
        super(base, width, height);
        this.base = base;
        this.width = width;
        this.height = height;
    }

    public String getName()
    {
        return "pyramid";
    }

    public double getArea() {
        double unroundedArea = (base * width) + base * Math.sqrt(Math.pow(width/2, 2) + Math.pow(height, 2)) + width * Math.sqrt(Math.pow(base/2, 2) + Math.pow(height,2));
        return (double)(Math.round(unroundedArea * 100)) / 100;
    }

    @Override
    public double getVolume()
    {
        return (double)Math.round(base * width * height / 3 * 100) / 100;
    }

}
