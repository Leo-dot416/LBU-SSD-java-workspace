/**
 * Stores a fixed number of integer values and provides simple statistics
 * about them: the maximum, minimum, total, and average.
 * <p>
 * The capacity is set when the object is created. Values are then added one
 * at a time with {@link #addValue(int)}.
 * </p>
 */

import java.util.Arrays;
public class Stats
{  
    /** Array that holds the stored values. Its length is the capacity. */
    private final int[] numbers;

    /** Number of values added so far, and the index of the next free slot. */
    private int count;

    /**
     * Adds a value to the next free position in the collection.
     *
     * @param value the integer value to store
     * @throws ArrayIndexOutOfBoundsException if the collection is already full
     */
    public void addValue(int value)
    {
        numbers[count] = value;
        count++;                    // Increments the count to indicate that a new value has been added
    }

    /**
     * Returns the size of the underlying array, which is the capacity passed
     * to the constructor.
     *
     * @return the number of values the collection can hold
     */
    public int getCount()
    {
        return numbers.length;
    }

    /**
     * Finds the largest value in the collection.
     *
     * @return the maximum value stored
     * @throws ArrayIndexOutOfBoundsException if the capacity is zero
     */
    public int getMax()
    {
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++)
        {
            if (numbers[i] > max)
                max = numbers[i];   // Goes through each value in the array and compares it to the current maximum
        }
        return max;
    }

    /**
     * Finds the smallest value in the collection.
     *
     * @return the minimum value stored
     * @throws ArrayIndexOutOfBoundsException if the capacity is zero
     */
    public int getMin()
    {
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++)
        {
            if (numbers[i] < min)
                min = numbers[i]; // Goes through each value in the array and compares it to the current minimum
        }
        return min;
    }

    /**
     * Adds up all the values in the collection.
     *
     * @return the sum of all stored values
     */
    public int getTotal()
    {
        int total = 0;
    // total all values within the array
        for (int i = 0; i < numbers.length; i++)
        {
            total += numbers[i]; // Adds each value in the array to the total
        }
        return total;
    }

    /**
     * Calculates the arithmetic mean of the values in the collection.
     * The total is divided by the capacity of the array.
     *
     * @return the average of the stored values, or {@link Double#NaN} if the
     *         capacity is zero
     */
    public double getAverage()
    {
        int x = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            x += numbers[i]; // Adds each value in the array to the total
        }
        double avg = x/(double)numbers.length;
        return avg;
    }

    /**
     * Returns the stored values as text, in the format produced by
     * {@link Arrays#toString(int[])}, for example {@code "[4, 17, 32]"}.
     *
     * @return a string listing all values in the collection
     */
    @Override
    public String toString()
    {
        return Arrays.toString(numbers);
    }

    /**
     * Creates an empty {@code Stats} object that can hold {@code capacity}
     * values.
     *
     * @param capacity the maximum number of values the collection can hold
     * @throws NegativeArraySizeException if {@code capacity} is negative
     */
    public Stats(int capacity)
    {
        numbers = new int[capacity];
    }
}