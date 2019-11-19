import java.util.Arrays;
public class AscendDescend
{
    public static void main(String[] args)
    {
        String[] ssAscend = {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman"};    
        Arrays.sort(ssAscend);

        String[] ssDescend = new String[10];

        for(int i = 0; i < ssAscend.length; i++)
        {
            ssDescend[i] = ssAscend[9 - i];
        }

        System.out.println("Ascend" + "\t" + "Descend");
        for(int j = 0; j < ssAscend.length; j++)
            System.out.println(ssAscend[j] + "\t" + ssDescend[j]);
    }
}