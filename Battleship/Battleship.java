import java.util.Scanner;
public class Battleship
{
    private String[][] grid = new String[8][8];

    public Battleship(String[][] dummy)
    {
        grid = dummy;
        fire();
        printBoardFirst();
    }
    public void fire()
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Pick a row to fire on: ");
        int xCoords = kb.nextInt();
        System.out.print("Pick a column to fire on: ");
        int yCoords = kb.nextInt();

        if()
        grid[xCoords][yCoords] = "1";
        printBoard();
    }
    public void printBoard()
    {
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid.length; j++)
            {
                if(grid[i][j].equals("1"))
                    System.out.print("[X]");
                else if()
                    System.out.print("[O]")
                else
                    System.out.print("[" + grid[i][j] + "]");
            }
            System.out.println();
        }
    }
    public boolean gameisOver()
    {
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid.length; j++)
            {
                if(grid[i][j].equals("4"))
                    return false;
            }
        }
        return true;
    }
}