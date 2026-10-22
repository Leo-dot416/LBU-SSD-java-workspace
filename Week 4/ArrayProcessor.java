public class ArrayProcessor 
{
     public int getArrayLength(Object[] a)
    {
        int count = 0;
        while (true)
        {
            try
            {
                Object o = a[count];
                count++;
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                break;
            }
        }
        return count;
    }

    public ArrayProcessor() 
    {
        super();
    }
    
}
