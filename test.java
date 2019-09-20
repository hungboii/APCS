import java.util.Scanner;
public class test
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a sentence. ");
        String sentence = kb.nextLine();
        System.out.print("string to remove:  ");
        String remove = kb.nextLine();

        System.out.println();
        System.out.println(sentence + " - String to remove " + remove);
        int i = 0;
    
        while(i < sentence.length() - remove.length())
        {
            String word = sentence.substring(i, i + remove.length());
            
            if(!(remove.equals(word)))
            {
                System.out.print(sentence.substring(i, i + 1));
                i++;
            }

            if((remove.equals(word)))
            {
                i = i + remove.length();
            }
        }   

        if(i >= sentence.length() - remove.length())
        {
            String leftover = sentence.substring(i);
            
            if(!(leftover.equals(remove)))
            {
                System.out.print(leftover);
            }
        }
    }
}