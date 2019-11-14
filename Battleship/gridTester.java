public class gridTester
{
    public static void main(String[] args)
    {        
        MakeBoard bot = new MakeBoard(); //this is just to test if boats are placing correctly
        STring[][] grid = bot.getGrid();

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