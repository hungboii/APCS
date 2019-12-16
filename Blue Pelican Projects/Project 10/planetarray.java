import java.util.Scanner;
public class planetarray
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("What is your weight on the Earth? ");
        double weight = kb.nextDouble();
        System.out.println();
        String[] planets = {"Mercury", "Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};

        for(int i = 0; i < planets.length; i++)
        {
            System.out.println((i + 1) + ". " + planets[i]);
        }

        System.out.println();
        System.out.print("Selection? ");
        int choice = kb.nextInt();
        System.out.println(" ");

        double[] gravities = {3.7, 8.87, 3.711, 24.79, 10.44, 8.87, 11.15};
        
        double planetweight = weight / 9.8 * gravities[choice - 1];
        System.out.print("Your weight on " + planets[choice - 1] + " would be " + planetweight);
    }
}