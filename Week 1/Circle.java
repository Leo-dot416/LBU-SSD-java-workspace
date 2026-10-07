public class Circle extends Shape
{
    private int radius;

    public int getRadius() // Get Circle Radius
    {
        return radius;
    }

    public void setRadius(int radius) // Set Circle Radius
    {
        this.radius = radius;
    }

    public int getArea() // Get Circle Area
    {
        return (int) (Math.PI * radius * radius);
    }

    public Circle(int radius) // Constructor: Adds sides 0 and adds radius parameter
    {
        super(0);
        this.radius = radius;
    }

    public String toString() // Print Circle
    {
        return "Radius: " + radius + " Sides: " + getSides() + ", Area: " + getArea();
    }
}
