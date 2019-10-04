public class test
{
    public static void main(String[] args)
    {
        int number = Integer.parseInt(args[0]);
        
        System.out.print(number + " is " + toRoman(number));     
    }
    public static String toRoman(int orig)
    {
        String[] romanNumbers = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        String roman = "";

        for(int i = 0; orig > 0; i++)
        {    
            if(numbers[i] <= orig)
            {
                orig = orig - numbers[i];
                roman = roman + romanNumbers[i];
                i = 0;
            }
        }
        return roman;
    }
}
   
