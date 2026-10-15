import java.util.Scanner;

public class Driver
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter sentence.");

        
        String userSentence = userInput.nextLine();
        userInput.close();

        Counter s1 = new WordProcessor();

        int wordNo = s1.countWords(userSentence);
        int lettersNo = s1.countLetters(userSentence);
        int length = s1.getLength(userSentence);

        if (userSentence == null || userSentence.trim().isEmpty())
        {
            ((WordProcessor) s1).setText("Value is null");
            userSentence = ((WordProcessor) s1).getText();
        }

        System.out.println("The sentence is: " + userSentence + ", The number of words is: " + wordNo + ", The number of letters is: " + lettersNo + ", The length of the word is: " + length);
    }
}


