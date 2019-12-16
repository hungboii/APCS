import java.util.Scanner;
public class planetweight
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("What is your weight on the Earth? ");
        double weight = kb.nextDouble();
        System.out.println();

        System.out.println("M. Mercury");
        System.out.println("V. Venus");
        System.out.println("R. Mars");
        System.out.println("J. Jupiter");
        System.out.println("S. Saturn");
        System.out.println("U. Uranus");
        System.out.println("N. Neptune");
        System.out.println();

        System.out.print("Selection? ");
        String choice = kb.next();
        char chr = choice.charAt(0);
        System.out.println(" ");

        switch(chr)
        {
            case 'm':
            case 'M':
                System.out.print("Your weight on Mercury would be " + (weight / 9.8 * 3.7));
                break;
            case 'v':
            case 'V':
                System.out.print("Your weight on Venus would be " + (weight / 9.8 * 8.87));
                break;
            case 'r':
            case 'R':
                System.out.print("Your weight on Mars would be " + (weight / 9.8 * 3.711));
                break;
            case 'j':
            case 'J':
                System.out.print("Your weight on Jupiter would be " + (weight / 9.8 * 24.79));
                break;
            case 's':
            case 'S':
                System.out.print("Your weight on Saturn would be " + (weight / 9.8 * 10.44));
                break;
            case 'u':
            case 'U':
                System.out.print("Your weight on Uranus would be " + (weight / 9.8 * 8.87));
                break;
            case 'n':
            case 'N':
                System.out.print("Your weight on Neptune would be " + (weight / 9.8 * 11.15));
        }
    }
}