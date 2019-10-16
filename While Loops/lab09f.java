import java.util.Scanner;
public class lab09f
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a sentence. ");
        String sentence = kb.nextLine();
        System.out.print("letter to remove: ");
        String letter = kb.nextLine();
        int index = sentence.indexOf(letter);
        String remaining = sentence;

        while(index != -1)
        {
            String removed = remaining.substring(0, index);
            remaining = remaining.substring(index + 1);
            index = remaining.indexOf(letter);
            System.out.print(removed);
        }   
        if(index == -1)
        {
            System.out.print(remaining);
        }
    }
}