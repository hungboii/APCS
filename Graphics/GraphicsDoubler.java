import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class GraphicsDoubler
{
    public static void main (String[] args) throws IOException
    {
        File myfile = new File("ChristmasTree.java");
        Scanner filereader = new Scanner(myfile);
        FileWriter fw = new FileWriter(args[0]);
        PrintWriter output = new PrintWriter(fw);
        int scale = Integer.parseInt(args[1]);
        double percentage = scale / 100;
        String[] blacklist = {"import", "Color", "sleep"};

        //try { Scanner filereader = new Scanner(myfile); }
        //catch(IOException e) { System.out.println("File not found error!"); }
        
        while (filereader.hasNext())
        {
            String line = filereader.nextLine();
            for(String word : blacklist)
                if(line.matches(word))
                    output.print(line);
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
                            number = Integer.parseInt(number) * percentage + "";
                            output.print(number);
                            number = "";
                            j = j + k; //skip to the end of the number
                            break;
                        }
                    }
                }
                output.print(chr[j]);
            }
            output.println();
        }
        filereader.close();
        fw.close();
        output.close();
    }
}