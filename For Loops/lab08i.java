import java.util.Scanner;
public class lab08i
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number. ");
        int x = kb.nextInt();
        int w = 0;
        for(int y = 2; y <= Math.sqrt(x); y++)
        {
            if(x % y == 0)
            {
                w = x;
                System.out.print(x + " is not prime.");
                break;
            }
        }
        if(w == 0)
        {
            System.out.print(x + " is prime.");
        }
    }
}