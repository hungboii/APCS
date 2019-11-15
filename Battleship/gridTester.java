public class gridTester
{
    public static void main(String[] args)
    {        
        int[] boats = {6, 5, 4, 3, 2};
        MakeBoard bot = new MakeBoard(boats); //this is just to test if boats are placing correctly
        String[][] grid = bot.getGrid();

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