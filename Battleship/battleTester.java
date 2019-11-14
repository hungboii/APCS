public class battleTester
{
    public static void main(String[] args)
    {
        MakeBoard realGrid = new MakeBoard();
        Battleship playGame = new Battleship(realGrid.getGrid(), 30);

        playGame.printBoard();
        System.out.println("Enter coordinates in the format A1. X is a hit and O is a miss."); 
        System.out.println("Moves left: 35. Boats left: 4");

        while(playGame.gameisOver() == false)
        {    
            playGame.fire();
            System.out.println("Moves left: " + playGame.getMoves());
            try { //put a small delay between printing hit/miss and printing board so player can see clearly if hit/miss
                Thread.sleep(1000); 
                } catch (InterruptedException e) { }
            playGame.printBoard(); 
            System.out.println();
        }
    }
}
//to do:
//make it look cleaner - line spcacing
//maybe do different size boats? last priority tho
//different difficulties?
//hits count as moves?