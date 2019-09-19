import java.util.Scanner;
public class planetweight
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("What is your weight on the Earth? ");
        int weight = kb.nextInt();
        System.out.println();

        System.out.println("1. Mercury");
        System.out.println("2. Venus");
        System.out.println("3. Mars");
        System.out.println("4. Jupiter");
        System.out.println("5. Saturn");
        System.out.println("6. Uranus");
        System.out.println("7. Neptune");
        System.out.println();

        System.out.print("Selection? ");
        int choice = kb.nextInt();
        System.out.println(" ");

        switch(choice)
        {
            case 1:
                System.out.print("Your weight on Mercury would be " + (weight / 9.8 * 3.7));
                break;
            case 2:
                System.out.print("Your weight on Venus would be " + (weight / 9.8 * 8.87));
                break;
            case 3:
                System.out.print("Your weight on Mars would be " + (weight / 9.8 * 3.711));
                break;
            case 4:
                System.out.print("Your weight on Jupiter would be " + (weight / 9.8 * 24.79));
                break;
            case 5:
                System.out.print("Your weight on Saturn would be " + (weight / 9.8 * 10.44));
                break;
            case 6:
                System.out.print("Your weight on Uranus would be " + (weight / 9.8 * 8.87));
                break;
            case 7:
                System.out.print("Your weight on Neptune would be " + (weight / 9.8 * 11.15));
        }
    }
}