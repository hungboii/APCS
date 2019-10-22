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
    public int[] numerFactors()
    {
        int[] numFactors = new int[numerator + 1];

        for(int i = 1; i <= numerator; i++)
        {
            if(numerator % i == 0)
            {
                numFactors[i] = i; 
            }
        }
        return numFactors;
    }
    public int[] denomFactors()
    {
        int[] denFactors = new int[denominator + 1];

        for(int i = 1; i <= denominator; i++)
        {
            if(denominator % i == 0)
            {
                denFactors[i] = i; 
            }
        }
        return denFactors;
    }
    public int greatestFactor()
    {
        int[] nums1 = numerFactors();
        int[] nums2 = denomFactors();

        int gcf = 1;

        yessir: 
        for (int i = nums1.length - 1; i >= 0; i--) 
        {
            for(int j = nums2.length - 1; j >= 0; j--)
            {
                if(nums1[i] == nums2[j] && nums1[i] != 0)
                {
                    gcf = nums1[i];
                    break yessir;
                }
            }
        }
        return gcf;
    }
    public boolean isReducible()
    {
        if(greatestFactor() == 1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public void reduce()
    {
        int gcf = greatestFactor();
        System.out.println(numerator / gcf + " / " + denominator / gcf);
    } 
}