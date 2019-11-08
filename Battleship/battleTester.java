public class battleTester
{
    public static void main(String[] args)
    {
        MakeBoard realGrid = new MakeBoard();
        Battleship playGame = new Battleship(realGrid.getGrid());

        playGame.printBoard();

        while(playGame.gameisOver() == false)
        {    
            playGame.fire();
            playGame.printBoard(); 
        }
        
        if(playGame.gameisOver() == true)
            System.out.print("Congrats, you won!");
    }
}