import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileDoubler
{
    public static void main (String[] args) throws IOException
    {
        File myfile = new File("bruh.txt");
        Scanner filereader = new Scanner(myfile);;
        
        //try { Scanner filereader = new Scanner(myfile); }
        //catch(IOException e) { System.out.println("File not found error!"); }
        
        while (filereader.hasNext())
        {
            String line = filereader.nextLine();
            char[] chr = line.toCharArray();
            String number;
            
            for(int j = 0; j < chr.length; j++)
            {
                if(chr[j] >= 48 && chr[j] <= 57) //if number
                { 
                    number = chr[j] + "";
                    for(int k = 1; k < chr.length - j; k++)
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
        } 
        filereader.close();
    }
}