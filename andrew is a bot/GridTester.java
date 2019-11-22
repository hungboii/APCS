public class GridTester
{
    public static void main(String[] args)
    {
        ShipMaker bot = new ShipMaker();
        bot.makeShip();
        int[][] board = bot.getBoard();

        for(int i= 0; i<board.length; i++)
        {
            for(int j = 0; j<board.length; j++)
            {
                System.out.print("[" + board[i][j] + "]");
            }   
        System.out.println("");
        }
    }
}