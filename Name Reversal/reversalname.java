import java.util.Scanner;
public class reversalname
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please print your name. ");
        String name = keyboard.nextLine();
        
        for(int len = name.length(); len > 0; len--)
        {
            String reverse = name.substring(len - 1, len);
            System.out.print(reverse.toLowerCase());
        }
    }
}