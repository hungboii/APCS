import java.util.Scanner;
public class OddorEven
{
    public static void main(String[] args)
    {
        Scanner leadership = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int corrupt = leadership.nextInt();
        if (corrupt % 2 == 0)
        {
            System.out.println("The integer " + corrupt + " is even." );
        }
        else 
        {
            System.out.println("The integer " + corrupt + " is odd.");
        }
    }
}