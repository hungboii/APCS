import java.util.Scanner;
public class RadiusOfCircle
{
    public static void main(String[] args)
    {
        Scanner alpha = new Scanner(System.in);
        System.out.print("What is the area? ");
        double ooga = alpha.nextDouble();
        double booga = Math.sqrt(ooga/Math.PI);
        System.out.print("Radius of your circle is " + booga + ".");
    }
}