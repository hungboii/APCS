public class battleTester
{
    public static void main(String[] args)
    {
        int[] boats = {5, 4, 3, 3, 2};
        MakeBoard realGrid = new MakeBoard(boats);
        Battleship playGame = new Battleship(realGrid.getGrid(), 20);

        playGame.printBoard();
        System.out.println("Enter coordinates in the format A1. X is a hit and O is a miss."); 
        System.out.println("Misses left: 20."); 

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
            System.out.println("Game Over. Imagine losing to a bot lmao");
            CheatBoard bot = new CheatBoard(); //shows where the boats were if the player loses
            bot.printBoard();
        }
       
    }
}
//to do:
//make it look cleaner - line spcacing
//maybe do different size boats? last priority tho
//different difficulties?
//hits count as moves?
//winning w/ zero moves left still prints loss message - change gameisLost to false after winning? 