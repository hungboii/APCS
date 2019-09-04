import java.util.Scanner;
public class nameiscool
{
    public static void main(String[] args)
    {
        Scanner mouse = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = mouse.nextLine();
        int x = 0;
        while(x<=30000)
        {
            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException e){}

            System.out.print(name + " is cool!                                                                                     ");
            x++;
        }
    }
}