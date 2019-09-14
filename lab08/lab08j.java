import java.util.Scanner;
public class lab08j
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a binary number. ");
        int binary = kb.nextInt();
        int num = 0;
        int binary1 = binary;

        for(int power = 0; binary > 0; power++)
        {
            num = num + (int)((binary % 10) * (Math.pow(2, power)));
            binary = binary / 10;
        }
        System.out.print(binary1 + " == " + num);
    }
}