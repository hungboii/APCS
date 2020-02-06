public class LinearFunction implements LinearFunctionMethods
{
    private double slope;
    private double yInt;

    public LinearFunction(double m, double b)
    {
        slope = m;
        yInt = b;
    }
    public double getSlope()
    {
        return slope;
    }
    public double getYintercept()
    {
        return yInt;
    }
    public double getRoot()
    {
        return getXvalue(0);
    }
    public double getYvalue(double x)
    {
        return (slope * x) + yInt;
    }
    public double getXvalue(double y)
    {
        return (y - yInt) / slope;
    }
}