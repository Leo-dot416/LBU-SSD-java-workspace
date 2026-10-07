public class Ellipse extends Rectangle
{

    public int getArea() // Get Ellipse Area
    {
        return (int) (0.5 * width * 0.5 * height * Math.PI);

    }

    public Ellipse(int width, int height) // Constructor: Sets sides 0
    {
        super(width, height);
        super.setSides(0);
    }
}
