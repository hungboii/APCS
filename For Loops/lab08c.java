import java.util.Scanner;
public class lab08c
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a word. ");
        String word = kb.nextLine();

        for(int num = 0; num < word.length(); num++)
        {
            System.out.println(word);
        }
    }
}