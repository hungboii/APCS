import java.util.Arrays;
public class MakeBoard
{
    private int xCoords;
    private int yCoords;
    private String[][] grid = new String[8][8];
    private int boatlength;
    private int boatsLeft;

    public setupBoard()
    {
        for(String[] rows : grid)
        {
            Arrays.fill(rows, "0");
        }
        boatlength = 4;
        boatsLeft = 4;

        setBoats();
    }
    public void setBoats()
    {
        while(boatsLeft > 0)
        {
            xCoords = (int)(Math.random() * 8);
            yCoords = (int)(Math.random() * 8);

            if(xCoords <= 4 && isSpace())
            {
                for(int i = 0; i < boatlength; i++)
                {
                    grid[yCoords][xCoords + i] = boatlength + "";
                }
                boatsLeft--;
            }
            else if(xCoords > 4 && yCoords <= 4 && isSpace())
            {
                for(int i = 0; i < boatlength; i++)
                {
                    grid[yCoords + i][xCoords] = boatlength + "";
                }
                boatsLeft--;
            }
            else if(xCoords > 4 && yCoords > 4 && isSpace())
            {
                for(int i = 0; i < boatlength; i++)
                {
                    grid[yCoords - i][xCoords] = boatlength + "";
                }
                boatsLeft--;
            }
        }
    }
    public boolean isSpace()
    {
        if(xCoords <=4)
        {
            for (int i = 0; i < boatlength; i++)
            {
                if ((grid[yCoords][xCoords + i].equals("4")))
                    return false;
            }
        }
        else if(xCoords > 4 && yCoords <=4)
        {
            for (int i = 0; i < boatlength; i++)
            {
                if ((grid[yCoords + 1][xCoords].equals("4")))
                    return false;
            }
        }
        else if(xCoords > 4 && yCoords > 4)
        {
            for (int i = 0; i < boatlength; i++)
            {
                if ((grid[yCoords - 1][xCoords].equals("4")))
                    return false;
            }
        }
        return true;
    }
    public String[][] getGrid()
    {
        return grid;
    }
}