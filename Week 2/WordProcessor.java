public class WordProcessor implements Counter
{
    String text;

    @Override
    public int countWords(String sentence)
    {
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

    @Override
    public int countLetters(String sentence)
    {
        int count = 0;

        for (int i = 0; i < sentence.length(); i++)
        {
            if (Character.isLetter(sentence.charAt(i)))
                count++;
        }

        return count;
    }

    @Override
    public int getLength(String sentence)
    {
        return sentence.length();
    }

    public String getText()
    {
        return text;
    }

    public void setText()
    {
        this.text = text;
    }

}
