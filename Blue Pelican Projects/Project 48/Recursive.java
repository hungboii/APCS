import java.util.Scanner;
import java.util.Arrays;
public class Recursive
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("What is the number? ");
        long num = kb.nextLong();

        long divisor = 1;
        long root = (long) Math.sqrt(num);

        long startTime = System.nanoTime();

        recursive(num, divisor, root);

        System.out.println("");
        long endTime = System.nanoTime();
        long elaspedTime = endTime - startTime;
        System.out.println("It took " + (elaspedTime)/1000000000.0 + " seconds.");
    }
    public static void recursive(long num, long d, long sqroot)
    {
        if(d > sqroot)
            return;
        else if(num % d == 0)
        {
            System.out.print(d + " ");
            System.out.print(num / d + " ");
            recursive(num, d + 1, sqroot);
        }
        else
            recursive(num, d + 1, sqroot);
    }
}