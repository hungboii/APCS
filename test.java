import java.util.*;

public class test
{
    public static void main(String[] args)
    {
        ArrayList<Integer> turnCounter = new ArrayList<Integer>(50);

        for (int i = 0; i < 50; i++) 
            turnCounter.add(3);

        for(int j = 0; j < 50; j++)
            turnCounter.set(j, turnCounter.get(j) - 1);

        System.out.print(turnCounter);

    }
}