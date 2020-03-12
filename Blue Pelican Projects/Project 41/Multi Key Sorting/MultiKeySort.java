import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class MultiKeySort 
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File myfile = new File("Names_ages.txt");
        Scanner filereader = new Scanner(myfile);
        
        ArrayList<String> names = new ArrayList<String>();

        while(filereader.hasNext())
        {
            names.add(filereader.nextLine());
        }
        sort(names);
        for(String joe: names)
            System.out.println(joe.substring(0, joe.indexOf(" ")) + ", " + joe.substring(joe.indexOf(" ") +1));
        filereader.close();
    }

    public static void sort(ArrayList<String> names)
    {
        int minIndex;
        for(int i = 0; i < names.size(); i++)
        {
            minIndex = i;
            for(int j = i + 1; j < names.size(); j++)
            {
                String name1 = names.get(j).substring(0, names.get(j).indexOf(" "));
                String name2 = names.get(minIndex).substring(0, names.get(minIndex).indexOf(" "));

                if(name1.compareTo(name2) < 0)
                    minIndex = j;

                else if(name1.compareTo(name2) == 0) //if names are same
                    if(Integer.parseInt(names.get(j).substring(names.get(j).indexOf(" ") + 1)) < Integer.parseInt(names.get(minIndex).substring(names.get(minIndex).indexOf(" ") + 1)))
                        minIndex = j;
            }

            String temp = names.get(minIndex);
            names.set(minIndex, names.get(i)); //swap first number to where its supposed to go
            names.set(i, temp); //set first number to what is lowest number
        }
        
    }
}