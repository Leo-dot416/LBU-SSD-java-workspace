public class ArrayDriver 
{
    public static void main(String[] args) 
    {
        ArrayProcessor processor = new ArrayProcessor();
        int len = processor.getArrayLength(new String[] { "Hello", "World", null, "Java" });
        System.out.println("Length of the array: " + len);
        
    }
}
