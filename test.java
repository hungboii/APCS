public class test
{
    public static void main(String[] args)
    {
        int[] denFactors = new int[15];
        int[] numFactors = new int[15];

        int numerator = 5;
        int denominator = 10;

        for(int i = 1; i <= numerator; i++)
        {
            if(numerator % i == 0)
            {
                numFactors[i] = i; 
            }
        }

        for(int i = 1; i <= denominator; i++)
        {
            if(denominator % i == 0)
            {
                denFactors[i] = i; 
            }
        }
        for(int j = 0; j < numFactors.length; j++)
        {
            System.out.print(numFactors[j]);
        }
        System.out.println();
        for(int j = 0; j < denFactors.length; j++)
        {
            System.out.print(denFactors[j]);
        }
    }
}
