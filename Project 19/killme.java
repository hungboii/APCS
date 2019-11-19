import java.util.Arrays;
public class killme
{
    public static void main(String[] args)
    {
        String[] ssAscend = {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman"};    
        Arrays.sort(ssAscend);

        String[] ssDescend = new String[10];
        int[] numSpaces = new int[10];

        for(int i = 0; i < ssAscend.length; i++)
        {
            ssDescend[i] = ssAscend[9 - i];
            numSpaces[i] = 10 - ssAscend[i].length();    
        }

        String[] spaces = new String[10];
        Arrays.fill(spaces, "");
        for(int k = 0; k < spaces.length; k++)
        {
            while(numSpaces[k] > 0)
            {
                spaces[k] = spaces[k] + " ";
                numSpaces[k]--;
            }
        }

        System.out.println("Ascend    Descend");
        System.out.println();
        for(int j = 0; j < ssAscend.length; j++)
            System.out.println(ssAscend[j] + spaces[j] + ssDescend[j]);
    }
}