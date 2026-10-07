public class Driver
{
    public static void main(String[] args)
    {
        // Test for Rectangle
        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(10, 5);
        Rectangle r3 = new Rectangle(10, 10);

        String newLine = System.lineSeparator(); // Create a new line

        System.out.println("Rectangle 1; " + r1 + "," + newLine + "Rectangle 2; " + r2 + "," + newLine + "Retangle 3; " + r3);

        // Test for Circle
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(10);
        Circle c3 = new Circle(15);

        System.out.println("Circle 1; " + c1 + "," + newLine + "Circle 2; " + c2 + "," + newLine + "Circle 3; " + c3);

        // Test for Ellipse
        Ellipse e1 = new Ellipse(5, 10);
        Ellipse e2 = new Ellipse(10, 5);
        Ellipse e3 = new Ellipse(10, 10);

        System.out.println("Ellipse 1; " + e1 + "," + newLine + "Ellipse 2; " + e2 + "," + newLine + "Ellipse 3; " + e3);
    }
}
