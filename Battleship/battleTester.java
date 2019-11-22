public class battleTester
{
    public static void main(String[] args)
    {
        int[] boats = {6, 5, 4, 3, 2};
        int moves = 25;
        MakeBoard realGrid = new MakeBoard(boats);
        Battleship playGame = new Battleship(realGrid.getGrid(), moves);

        CheatBoard bot = new CheatBoard(); //shows where the boats
        bot.printBoard();
        System.out.println();

        playGame.printBoard();
        System.out.println("Enter coordinates in the format A1. X is a hit and O is a miss."); 
        System.out.println("Misses left: " + moves); 

        while(playGame.gameisWon() == false && playGame.gameisLost() == false)
        {    
            playGame.fire();
            System.out.println("Misses left: " + playGame.getMoves());
            System.out.println();
            playGame.printBoard(); 
            System.out.println();
            playGame.printShipsLeft();
            System.out.println();
        }

        if(playGame.gameisWon())
        {
            System.out.print("Congrats, you win!");
        }
        else if(playGame.gameisLost())
        {
            System.out.println("Game Over. Imagine losing to a bot lmao.");
        }
       
    }
}
//to do:
//different difficulties?
//change Xs to smaller/easier to see character after sinking?