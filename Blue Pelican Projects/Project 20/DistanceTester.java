import java.util.Scanner;
public class DistanceTester
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the A value of the line: ");
        DistToLine.A= kb.nextDouble();

        System.out.print("Enter the B value of the line: ");
        DistToLine.B = kb.nextDouble();

        System.out.print("Enter the C value of the line: ");
        DistToLine.C = kb.nextDouble();

        System.out.print("Enter the x coordinate of the point: ");
        double X = kb.nextDouble();

        System.out.print("Enter the y coordinate of the point: ");
        double Y = kb.nextDouble();

        System.out.println();
        System.out.print("Distance from the point of the line is: " + DistToLine.getDist(X, Y));
    }
}