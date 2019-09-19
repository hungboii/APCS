import java.util.Scanner;
public class lab09g
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a sentence. ");
        String sentence = kb.nextLine();
        System.out.print("string to remove: ");
        String phrase = kb.nextLine();
        int index = sentence.indexOf(phrase);
        String remaining = sentence;
        int length = phrase.length();

        while(index != -1)
        {
            String removed = remaining.substring(0, index);
            remaining = remaining.substring(index + length + 1);
            index = remaining.indexOf(phrase);
            System.out.print(removed);
        }   
        if(index == -1)
        {
            System.out.print(remaining);
        }
    }
}