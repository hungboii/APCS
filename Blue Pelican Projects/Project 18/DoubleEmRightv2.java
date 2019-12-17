import java.util.Arrays;
import java.util.Scanner;
public class DoubleEmRightv2
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        String input = "";

        while(true)
        {
            System.out.print("Type in a sentence and press ENTER. ");
            input = kb.nextLine();

            if(input.equals("exit"))
                break;
        
            input = input + " bruh";
            char[] chr = input.toCharArray();
            String number;
            
            for(int j = 0; j < chr.length; j++)
            {
                if(j >= chr.length - 5)
                    break;
                if(chr[j] >= 48 && chr[j] <= 57) //if number
                { 
                    number = chr[j] + "";
                    for(int k = 1; k < chr.length - j - 1; k++)
                    {
                        if(chr[j + k] >= 48 && chr[j + k] <= 57) //check if numbers next to it are part of original number
                            number = number + chr[j + k]  + "";
                        else //if no longer part of the number, double it
                        {
                            number = Integer.parseInt(number) * 2 + "";
                            System.out.print(number);
                            number = "";
                            j = j + k; //skip to the end of the number
                            break;
                        }
                    }
                }
                System.out.print(chr[j]);
            }
            System.out.println();
            System.out.println();

        }
    }
}