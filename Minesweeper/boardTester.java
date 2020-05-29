public class boardTester
{
    public static void main(String[] args)
    {        
        Board bot = new Board(); //this was just to test if boats are placing correctly
        int[][] grid = bot.getBoard();

        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid.length; j++)
            {
                System.out.print("[" + grid[i][j] + "]");
            }
            System.out.println();
        }
    }
}