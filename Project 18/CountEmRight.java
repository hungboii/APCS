import java.util.Scanner;
public class CountEmRight
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
            input = input.toUpperCase() + "andrew is bot";
            String[] sp = input.split("s\\s+a");
            // for(int i = 0, i < sp.length, i++)
            //     System.out.println(sp[i]);
            int number = sp.length - 1 ;
            System.out.println("There are " + number + " occurences.");
        }
    }
}