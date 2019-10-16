import java.util.Scanner;
public class lab09e
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("enter a number. ");
        int num = kb.nextInt();
        int counter = 1;

        System.out.print(num + " has divisors ");
        while(counter < num)
        {
            if(num % counter == 0)      
            {
                System.out.print(counter + " ");
            }
            counter++;
        }
    }
}