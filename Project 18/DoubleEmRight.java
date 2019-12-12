import java.util.Scanner;
public class DoubleEmRight
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        String input = "";

        for(int i = 1; i > 0; i++)
        {
            System.out.print("Type in a sentence and press ENTER. ");
            input = kb.nextLine();

            if(input.equals("exit"))
                break;
                
            String[] sp = input.split("[\\W&&[^\\.';:?!]]"); //figure out punctuation

            for(int j = 0; j < sp.length; j++)
                System.out.println(sp[j]);

            for(String word : sp)
            {
                try
                {
                    word = Integer.parseInt(word) * 2 + "";
                    System.out.print(word + " ");
                }
                catch(NumberFormatException e)
                {
                    System.out.print(word + " ");
                }
            }
            System.out.println();
        }
    }
}