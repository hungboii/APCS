import java.util.Scanner;
public class fractionsTester
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the numerator: ");
        int numer = kb.nextInt();
        System.out.print("Enter the denominator: ");
        int denom = kb.nextInt();
        
        Fractions fraction = new Fractions(numer, denom);
        fraction.oneLine();
        System.out.println();
        fraction.manyLines();
        System.out.println();

        if(fraction.isReducible())
        {
            System.out.println("Your fraction is reducible.");
            fraction.reduce();
        }
        else
        {
            System.out.print("Your fraction is not reducible.");
        }
    }
}