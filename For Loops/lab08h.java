import java.util.Scanner;
public class lab08h
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number. ");
        long x = kb.nextLong();
        long y = 0;
        long x1 = x;
        
        for(y = x; x > 1; x--)
        {
            y = y * (x-1);
        }
        System.out.println("factorial of " + x1 + " is " + y);
    }
}