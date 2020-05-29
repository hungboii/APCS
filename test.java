
import java.util.Scanner;
public class test
{
    public static void main(String[] args)
    {
    

    }

    public applyTransfomraiton(String[] strings, int numStrings)
    {
        int[] numberArray = new int[numStrings];
        for(int i = 0; i < numStrings; i++)
        {
            numberArray[i] = transform(strings[i]);
        }
        return numberArray;
        
    }
}