import java.util.Scanner;
public class lab09i
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("enter a base 10 number. ");
        int num = kb.nextInt();
        System.out.print("what base to convert to? ");
        int base = kb.nextInt();
        int num1 = num;
        int answer = 0;

        System.out.print(num1 + " base 10 is ");

        while(num > 0)
        {
            answer = num % base;
            num = num / base;
            System.out.print(answer);
        }
        System.out.print(" in base " + base);
    }
}