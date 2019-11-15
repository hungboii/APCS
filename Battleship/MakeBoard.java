import java.util.Arrays;
public class MakeBoard
{
    private int xCoords;
    private int yCoords;
    private String[][] grid = new String[10][10];
    private int[] boatLength = new int[5];
    private int boatsLeft;

    public MakeBoard(int[] boats)
    {
        for(String[] rows : grid)
        {
            Arrays.fill(rows, "0");
        }
        for (int i = 1; i < grid.length; i++) //fills the top row with letters                       
            grid[0][i] = (char)(64 + i) + ""; 

        for (int i = 1; i < grid.length; i++) //fills the side with numbers                        
            grid[i][0] = i + "";
            
        boatLength = boats;
        boatsLeft = 5;

        setBoats();
    }
    private void setBoats() //randomly places the boats
    {
        int j = 0;
        while(boatsLeft > 0)
        {
            xCoords = (int)(Math.random() * 9) + 1;
            yCoords = (int)(Math.random() * 9) + 1;

            if(xCoords <= 4 && isSpace(j))
            {
                for(int i = 0; i < boatLength[j]; i++)
                    grid[yCoords][xCoords + i] = boatLength[j] + "";
                boatsLeft--;
                j++;
            }
            else if(xCoords > 4 && yCoords <= 4 && isSpace(j))
            {
                for(int i = 0; i < boatLength[j]; i++)
                    grid[yCoords + i][xCoords] = boatLength[j] + "";
                boatsLeft--;
                j++;
            }
            else if(xCoords > 4 && yCoords > 4 && isSpace(j))
            {
                for(int i = 0; i < boatLength[j]; i++)
                    grid[yCoords - i][xCoords] = boatLength[j] + "";
                boatsLeft--;
                j++;
            }
        }
    }
    private boolean isSpace(int j) //checks if the boats overlap
    {
        if(xCoords <= 4)
        {
            for (int i = 0; i < boatLength[j]; i++) 
            {
                if (!(grid[yCoords][xCoords + i].equals("0"))) 
                    return false;
            }
        }
        else if(xCoords > 4 && yCoords <= 4)
        {
            for (int i = 0; i < boatLength[j]; i++)
            {
                if (!(grid[yCoords + i][xCoords].equals("0")))
                    return false;
            }
        }
        else if(xCoords > 4 && yCoords > 4)
        {
            for (int i = 0; i < boatLength[j]; i++)
            {
                if (!(grid[yCoords - i][xCoords].equals("0")))
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