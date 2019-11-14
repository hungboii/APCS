import java.util.Arrays;
public class MakeBoard
{
    private int xCoords;
    private int yCoords;
    private String[][] grid = new String[9][9];
    private int boatLength;
    private int boatsLeft;

    public MakeBoard()
    {
        for(String[] rows : grid)
        {
            Arrays.fill(rows, "0");
        }
        for (int i = 0; i < grid.length; i++) //fills the top row with letters                       
            grid[0][i] = (char)(64 + i) + ""; 

        for (int i = 1; i < grid.length; i++) //fills the side with numbers                        
            grid[i][0] = i + "";
            
        boatLength = 5;
        boatsLeft = 4;

        setBoats();
    }
    private void setBoats() //randomly places the boats
    {
        while(boatsLeft > 0)
        {
            xCoords = (int)(Math.random() * 8) + 1;
            yCoords = (int)(Math.random() * 8) + 1;

            if(xCoords < 4 && isSpace())
            {
                for(int i = 0; i < boatLength; i++)
                    grid[yCoords][xCoords + i] = boatLength + "";
                boatsLeft--;
                boatLength--;
            }
            else if(xCoords >= 4 && yCoords < 4 && isSpace())
            {
                for(int i = 0; i < boatLength; i++)
                    grid[yCoords + i][xCoords] = boatLength + "";
                boatsLeft--;
                boatLength--;
            }
            else if(xCoords >= 4 && yCoords >= 4 && isSpace())
            {
                for(int i = 0; i < boatLength; i++)
                    grid[yCoords - i][xCoords] = boatLength + "";
                boatsLeft--;
                boatLength--;
            }
        }
    }
    private boolean isSpace() //checks if the boats overlap
    {
        if(xCoords < 4)
        {
            for (int i = 0; i < boatLength; i++) 
            {
                if (!(grid[yCoords][xCoords + i].equals("0"))) 
                    return false;
            }
        }
        else if(xCoords >= 4 && yCoords < 4)
        {
            for (int i = 0; i < boatLength; i++)
            {
                if (!(grid[yCoords + i][xCoords].equals("0")))
                    return false;
            }
        }
        else if(xCoords >= 4 && yCoords >= 4)
        {
            for (int i = 0; i < boatLength; i++)
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