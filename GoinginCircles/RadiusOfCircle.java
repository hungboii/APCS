import java.util.Scanner;
public class RadiusOfCircle
{
    public static void main(String[] args)
    {
        Scanner alpha = new Scanner(System.in);
        System.out.print("What is the area? ");
        double ooga = alpha.nextDouble();
        double booga = Math.sqrt(ooga/Math.PI);
        int fork = (int)(booga * 10);
        double knife = ((double)fork) / 10;
        System.out.print("Radius of your circle is " + knife + ".");
    }
}