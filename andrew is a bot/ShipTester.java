public class ShipTester
{
    public static void main(String[] args)
    {
        ShipMaker monkey = new ShipMaker();
        Battleship playGame = new Battleship(monkey.getBoard());

        while(playGame.gameOver() == false)
        {   
            playGame.printBoard();
            playGame.takeGuess();
        }    
        System.out.print("You win!");
    }
}