import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class MultiKeySort 
{
    public static void main(String[] args) throws IOException
    {
        File myfile = new File("Names_ages.txt");
        Scanner filereader = new Scanner(myfile);
        FileWriter fw = new FileWriter("Names_ages.txt");
        PrintWriter output = new PrintWriter(fw);
        
        while(fileread.hasNext())
        {

        }

        filereader.close();
        fw.close();
        output.close();
    }
}