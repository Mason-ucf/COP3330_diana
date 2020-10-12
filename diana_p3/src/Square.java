public class Square extends Shape2D
{
    private double height;

    public Square(double height)
    {
        super(height);
        this.height = height;
    }

    public String getName()
    {
        return "square";
    }

    public double getArea() {
        return (height*height);
    }

}
