import java.util.Scanner;
public class lab08j
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a binary number. ");
        long binary = kb.nextLong();
        long num = 0;
        long binary1 = binary;

        for(long power = 0; binary > 0; power++)
        {
            num = num + (long)((binary % 10) * (Math.pow(2, power)));
            binary = binary / 10;
        }
        System.out.print(binary1 + " == " + num);
    }
}