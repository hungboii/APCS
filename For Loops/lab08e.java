import java.util.Scanner;
public class lab08e
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = kb.nextInt();
        System.out.println("multiplication table for " + number);

        for(int num1 = 1; num1 <= number; num1++)
        {
            System.out.println(num1 + "   " + number * num1);
        }
    }
}