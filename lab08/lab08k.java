import java.util.Scanner;
public class lab08k
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number. ");
        int x = kb.nextInt();
        System.out.print("Enter another number. ");
        int y = kb.nextInt();
        int z = 1;

        while(z < x || z < y)
        {
            if(x % z == 0 && y % z == 0)
            {
                
                System.out.print("the gcd of " + x + " and " + y + " is " + z);
            }
            z++;
        }
    }
}