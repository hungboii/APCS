public class battleTester
{
    public static void main(String[] args)
    {
        MakeBoard realGrid = new MakeBoard();
        Battleship playGame = new Battleship(realGrid.getGrid());

        while(gameisOver == false)
        {    
            playgame.fire();
            playgame.printBoard(); 
        }
        
        if(playGame.gameisOver == true)
            System.out.print("Congrats, you won!");
    }
}