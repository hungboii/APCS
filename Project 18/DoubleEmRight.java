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
                
            String[] sp = input.split("\\s+"); //doesn't work for graphics bc no spaces for commas. find fix
            //String[] sp = input.split("[\\W&&[^\\p{Punct}]]"); //split on all non-word characters except punctuation. but if no spaces btwn letters and number doesn't work. now that i think aobut it this is literally just spaces only. 

            // for(int j = 0; j < sp.length; j++)
            //      System.out.println(sp[j]);

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
            System.out.println();
        }
    }
}