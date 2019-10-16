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
        int w = 0;

        for(int z = 1; z <= x || z <= y; z++)
        {
            if(x % z == 0 && y % z == 0)
            {
                w = z;
            }
            if(z == y || z == x)
            {
                System.out.print("the gcd of " + x + " and " + y + " is " + w);
                break;
            }
        }       
    }
}