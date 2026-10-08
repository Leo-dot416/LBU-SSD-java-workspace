import java.util.Scanner;

public class Driver
{
    public static void main(String[] args)
    {
        Scanner userI = new Scanner(System.in);
        System.out.println("Enter sentence.");

        String userSentence = userI.nextLine();

        Counter s1 = new WordProcessor();

        int wordNo = s1.countWords(userSentence);
        int lettersNo = s1.countLetters(userSentence);
        int length = s1.getLength(userSentence);

        System.out.println("The sentence is: " + userSentence + ", The number of words is: " + wordNo + ", The number of letters is: " + lettersNo + ", The length of the word is: " + length);
    }
}
