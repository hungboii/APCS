import java.util.Scanner;
public class lab09c
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("enter a number. ");
        int num = kb.nextInt();

        while(num > 0)
        {
            System.out.print(num % 10);
            num = num / 10;
        }
    }
}