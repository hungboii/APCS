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
    
        while(i < sentence.length() + remove.length())
        {
            String word = sentence.substring(i, i + sentence.length());
            if(!(remove.equals(word)))
            {
                System.out.print(sentence.substring(i, i + 1));
            }
            i++;
        }   
    }
}