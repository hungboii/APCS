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

        double percentage = Double.parseDouble(args[1])/100;
        String[] blacklist = {"import", "Color", "sleep", "Polygon"};

        //try { Scanner filereader = new Scanner(myfile); }
        //catch(IOException e) { System.out.println("File not found error!"); }
        
        test: while (filereader.hasNext())
        {
            String line = filereader.nextLine();

            if(line.contains("public class"))
            {
                output.println(line + "x2");
                continue;
            }

            for(String word : blacklist)
            {
                if(line.contains(word))
                {
                    output.println(line);
                    continue test;
                }
            }
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
                            number = (int)(Integer.parseInt(number) * percentage) + "";
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