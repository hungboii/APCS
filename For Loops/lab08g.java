import java.util.Scanner;
public class lab08g
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number. ");
        int x = kb.nextInt();
        System.out.print("Enter a bigger number. ");
        int y = kb.nextInt();
        int w = 0;
        int evens = 0;
        int odds = 0;
        System.out.println(x + " " + y);

        for(int z = x; z <= y || z <= x; z++)
        {
            if(y >= x)
            {
                w = w + x++;
            }
            if(z % 2 == 0)
            {
                if(z <=y)
                {
                evens++;    
                }
            }
            if(z % 2 == 1 || z % 2 == -1)
            {
                if(z <= y)
                {
                    odds++;
                }
            }
        }
        System.out.println("total " + w);
        System.out.println("even count " + evens);
        System.out.print("odd count " + odds);
    }
}