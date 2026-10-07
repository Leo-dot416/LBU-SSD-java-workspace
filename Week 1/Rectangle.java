public class Rectangle extends Shape
{

    protected int width;
    protected int height;

    public int getWidth() // Get Rectangle Width
    {
        return width;
    }

    public void setWidth(int width) // Set Rectangle Width
    {
        this.width = width;
    }

    public int getHeight() // Get Rectangle Height
    {
        return height;
    }

    public void setHeight(int height) // Set Rectangle Height
    {
        this.height = height;
    }

    public int getArea() // Get Rectangle Area
    {
        return width * height;
    }

    public Rectangle(int width, int height) // Constructor: Adds 4 sides and adds two new parameters
    {
        super(4);
        this.width = width;
        this.height = height;
    }

    public String toString() // Print Rectangle
    {
        return "Width: " + width + ", Height " + height + " Sides: " + getSides() + ", Area: " + getArea();
    }
}
