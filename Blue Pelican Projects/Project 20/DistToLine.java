public class DistToLine
{
    public static double A;
    public static double B;
    public static double C;

    public static double getDist(double a, double b)
    {
        double dist = Math.abs(A * a + B * b + C) / Math.sqrt(A * A + B * B);
        return dist;
    }
}