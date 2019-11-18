public class CheatBoard //this is to print to board with the ships on it for you or after the player loses
{
    public void printBoard()
    {        
        String[][] grid = Battleship.getBoard();

        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid.length; j++)
            {
                if(i == 0) //to print the first row
                {
                    System.out.print("[" + grid[i][j] + "]");
                    continue;
                }
                if(j == 0) //to print the first column
                {
                    System.out.print("[" + grid[i][j] + "]");
                    continue;
                }
                if(grid[i][j].equals("0") || grid[i][j].equals("-5")) //if there is no boat or it was a miss then print empty
                    System.out.print("[ ]");
                else 
                    System.out.print("[X]");
            }
            System.out.println();
        }
    }
}