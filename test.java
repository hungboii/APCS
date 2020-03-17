import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class test
{
    public static void main(String[] args) throws IOException
    {
        File multikeyfile = new File("names_ages.txt");
        Scanner fileReader = new Scanner(multikeyfile);
        String[] aRay = new String[100];
        int lineCount = 0;
        while (fileReader.hasNext()) //victim
        {
            String thisLine = fileReader.nextLine();
            System.out.println(thisLine);
            aRay[lineCount] = thisLine;
            lineCount++;
        }
        System.out.println(" - - - - - - - - - - - - - - ");
        mySort(aRay, lineCount);
        for (int k = 0; k < lineCount; k++)
        {
            System.out.println(aRay[k]);
        }
    }  

    public static void mySort(String[] myArray, int num)
    {
        String min;
        int minIndex;
        for (int i = 0; i < num; ++i)
        {
            min = myArray[i];
            minIndex = i;
            for (int j = i + 1; j < num; ++j)
            {
                if (myArray[j].substring(0, myArray[j].indexOf(" ")).compareTo(min.substring(0, min.indexOf(" "))) < 0 || (myArray[j].substring(0, myArray[j].indexOf(" ")).compareTo(min.substring(0, min.indexOf(" "))) == 0) && (Integer.parseInt(myArray[j].substring(myArray[j].indexOf(" ") + 1)) < (Integer.parseInt(min.substring(min.indexOf(" ") + 1))) ) )
                {
                    System.out.println(myArray[j].substring(0, myArray[j].indexOf(" ")) + Integer.parseInt(myArray[j].substring(myArray[j].indexOf(" ") + 1)) + "<" + min.substring(0, min.indexOf(" ")) + Integer.parseInt(min.substring(min.indexOf(" ") + 1)));

                    min = myArray[j];
                    minIndex = j;
                }
                // else if (myArray[j].substring(0, myArray[j].indexOf(" ")).compareTo(min.substring(0, min.indexOf(" "))) == 0)  
                // {
                    // int myInt = Integer.parseInt(myArray[j].substring(myArray[j].indexOf(" ") + 1));
                    // //System.out.println("my Int " + myInt);
                    // int minInt = Integer.parseInt(min.substring(min.indexOf(" ") + 1));
                    // //System.out.println("minInt " + minInt);
                    // if (myInt < minInt)
                    // {
                        // min = myArray[j]; 
                        // minIndex = j;
                    // }
                // }
                
            }
            myArray[minIndex] = myArray[i];
            myArray[i] = min;
            // System.out.println("-- -- - - - --  -- - ");
            // for (int re = 0; re < num; ++re)
            // {
            //     System.out.println(myArray[re]);
            // }
        }
    }
}