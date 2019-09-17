import java.util.Scanner;
public class lab09d
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("enter a number. ");
        int num = kb.nextInt();
        int num1 = num;
        int sum = 0;

        while(num > 0)
        {
            sum = sum + (num % 10);
            num = num / 10;
        }
        System.out.print(sum + " is the sum of the digits " + num1);
    }
}