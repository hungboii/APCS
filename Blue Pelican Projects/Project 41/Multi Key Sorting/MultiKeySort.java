import java.io.File;
import java.util.Scanner;
import java.io.*;

public class MultiKeySort
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File myfile = new File("Names_ages.txt");
        Scanner filereader = new Scanner(myfile);
        
        String[] names = new String[100];
        int[] ages = new int[100];
        int maxIndex = 0;

        while(filereader.hasNext())
        {
            String line = filereader.nextLine();
            names[maxIndex] = line.substring(0, line.indexOf(" "));
            ages[maxIndex] = Integer.parseInt(line.substring(line.indexOf(" ") + 1));
            maxIndex++;
        }
        sort(names, ages, maxIndex);

        for(int i = 0; i < maxIndex; i++)
            System.out.println(names[i] + ", " + ages[i]);
            
        filereader.close();
    }

    public static void sort(String[] names, int[] ages, int maxIndex)
    {
        int minIndex;
        for(int i = 0; i < maxIndex; i++)
        {
            minIndex = i;
            for(int j = i + 1; j < maxIndex; j++)
            {
                if(names[j].compareTo(names[minIndex]) < 0)
                    minIndex = j;

                else if(names[j].compareTo(names[minIndex]) == 0) //if names are same then compare the age
                    if(ages[j] < ages[minIndex])
                        minIndex = j;
            }

            String temp = names[minIndex];
            names[minIndex] = names[i];
            names[i] = temp; 

            int temporary = ages[minIndex];
            ages[minIndex] = ages[i];
            ages[i] = temporary; 
        }
        
    }
}