public class WordProcessor implements Counter
{
    @Override
    public int countWords(String sentence)
    {
        if (sentence == null || sentence.trim().isEmpty())
        {
            sentence = getText();
        }
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

    @Override
    public int countLetters(String sentence)
    {
        if (sentence == null || sentence.trim().isEmpty())
        {
            sentence = getText();
        }

        int count = 0;

        for (int i = 0; i < sentence.length(); i++)
        {
            if (Character.isLetter(sentence.charAt(i)))
                count++;
        }

        return count;
    }

    String text = "Value is null";

    @Override
    public int getLength(String sentence)
    {
        if (sentence == null || sentence.trim().isEmpty())
        {
            sentence = getText();
        }
        return sentence.length();
    }

    public String getText()
    {
        return text;
    }

    public void setText(String sentence)
    {
        this.text = sentence;
    }

}
