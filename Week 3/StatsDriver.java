// Driver.java file
import java.util.Random;

/**
 * Demonstrates the {@link Stats} class. It fills a {@code Stats} object with
 * random numbers and prints the values, average, count, total, minimum, and
 * maximum.
 */
public class StatsDriver
{
    /**
     * Program entry point. Creates a {@link Stats} object with room for 10
     * values, fills it with random integers from 0 to 99, and prints the
     * results.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args)
    {
        final int VALUES = 10;

        Stats stats = new Stats(VALUES); // Creates a new Stats object with room for 10 values

        Random random = new Random(); // Creates a new Random object to generate random numbers

        for (int i = 0; i < VALUES; i++)
        {
            stats.addValue(random.nextInt(100)); // Adds a random integer between 0 and 99 to the Stats object
        }
        System.out.println("Numbers stored : ");
        System.out.println(stats);
        System.out.println("Average = " + stats.getAverage());
        System.out.println("Count = " + stats.getCount());
        System.out.println("Total = " + stats.getTotal());
        System.out.println("Minimum value = " + stats.getMin());
        System.out.println("Maximum value = " + stats.getMax());
    }
}
