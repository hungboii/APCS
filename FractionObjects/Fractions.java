public class Fractions
{
    private int numerator;
    private int denominator;

    public Fractions(int n, int d)
    {
        numerator = n;
        denominator = d;
    }
    public void setNumerator(int aNumerator)
    {
        numerator = aNumerator;
    }
    public int getNumerator()
    {
        return numerator;
    }
    public void setDenominator(int aDenominator)
    {
        denominator = aDenominator;
    }
    public int getDenominator()
    {
        return denominator;
    }
    public void oneLine()
    {
        System.out.println(numerator + " / " + denominator);
    }
    public void manyLines()
    {
        System.out.println(numerator);
        System.out.println("--");
        System.out.println(denominator);
    }
}