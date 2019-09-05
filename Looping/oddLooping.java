import java.util.Scanner;
public class oddLooping
{
    public static void main(String[] args)
    {
        Scanner monitor = new Scanner(System.in);
        int x = 0;
        while(x < 3)
        {
            System.out.print("Enter an integer: ");
            int y = monitor.nextInt();
        
            if (y % 2 == 0)
            {
                System.out.println("The integer " + y + " is even." );
            }
            else 
            {
                System.out.println("The integer " + y + " is odd.");
            }
            x++;
        }
    }
}   