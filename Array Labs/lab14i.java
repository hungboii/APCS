import java.util.Scanner;
public class lab14i
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a base 10 or roman number. ");
        String input = kb.nextLine();
        int number = 0;
        
        char chr = input.charAt(0);
        if(Character.isDigit(chr))
        {
            number = Integer.parseInt(input);
            System.out.print(input + " is " + toRoman(number));
        }
        else
        {
            System.out.print(input + " is " + toNumber(input));
        }
    }
    public static int toNumber(String orig)
    {
        String[] romanNumbers = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        int answer = 0;

        for(int i = 0; orig.length() > 0; i++)
        {
            if(orig.length() == 1)
            {
                if(orig.substring(0).equals(romanNumbers[i]))
                {
                    answer = answer + numbers[i];
                    break;
                }
            }
            for(int j = 0; i <= romanNumbers.length; j++)
            {
                if(orig.length() == 1)
                {
                    break;
                }
                if(orig.substring(0, 2).equals(romanNumbers[j]))
                {
                    answer = answer + numbers[j];
                    orig = orig.substring(2);
                    break;
                }
                if(orig.substring(0, 1).equals(romanNumbers[j]))
                {
                    answer = answer + numbers[j];
                    orig = orig.substring(1);
                    break;
                }
            }
        }
        return answer;
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
                i = -1;
            }
        }
        return roman;
    }
}