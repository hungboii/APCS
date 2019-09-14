import java.util.Scanner;
public class lab08d
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a word. ");
        String word = kb.nextLine();

        for(int num = word.length(); num > 0; num--)
        {
            System.out.println(word.substring(0, num));
        }
    }
}