public class battleTester
{
    public static void main(String[] args)
    {
        MakeBoard realGrid = new MakeBoard();
        Battleship playGame = new Battleship(realGrid.getGrid());

        playGame.printBoard();
        System.out.println("Enter coordinates in this format - A1");

        while(playGame.gameisOver() == false)
        {    
            playGame.fire();
            playGame.printBoard(); 
        }

        System.out.println();
        System.out.print("Congrats, you win!");
    }
}

//to do: moves counter / limit the amount of shots you get
//if firing on spot already fired on, print a message saying that
//put a small delay between hit/miss and the printing of the board to make it more clear
//maybe do different size boats? last priority tho