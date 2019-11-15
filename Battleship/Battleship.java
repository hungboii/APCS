import java.util.Scanner;
import java.util.Arrays;
public class Battleship
{
    private static String[][] shipGrid = new String[10][10];
    private String[][] hitGrid = new String[10][10];
    private int yCoords;
    private int shipsLeft;
    private int moves;

    public Battleship(String[][] dummy, int numMoves)
    {
        shipGrid = dummy;
        shipsLeft = 5;
        moves = numMoves;

        for(String[] rows : hitGrid)
        {
            Arrays.fill(rows, " ");
        }
        for (int i = 1; i < hitGrid.length; i++) //fills the top row of the display grid with letters                     
            hitGrid[0][i] = (char)(64 + i) + ""; 

        for (int i = 1; i < hitGrid.length; i++) //fills the first column of the display grid with number                       
            hitGrid[i][0] = i + "";
    }
    public void fire()
    {  
        Scanner kb = new Scanner(System.in);
        System.out.print("Pick a place to fire on: ");
        String coords = kb.nextLine();
        char[] sepCoords = coords.toCharArray(); //seperates the coordinates into individual characters
        String yCords = sepCoords[0] + "";
        String xCords = sepCoords[1] + "";

        int xCoords = Integer.parseInt(xCords);

        switch(yCords) //converts the char into a number
        {
            case "a":
            case "A": 
                yCoords = 1;
                break;
            case "b":
            case "B": 
                yCoords = 2;                
                break;
            case "c":
            case "C": 
                yCoords = 3;                
                break;
            case "d":
            case "D": 
                yCoords = 4;                
                break;
            case "e":
            case "E": 
                yCoords = 5;               
                break;
            case "f":
            case "F": 
                yCoords = 6;                
                break;
            case "g": 
            case "G":
                yCoords = 7;
                break;
            case "h":
            case "H": 
                yCoords = 8;
                break;
            case "i":
            case "I":
                yCoords = 9;
        }
        System.out.println();

        if(shipGrid[xCoords][yCoords].equals("-5") || shipGrid[xCoords][yCoords].equals("-1")) //check if player already shot in this place
        {
            System.out.println("You already shot there, you monkey. Pick a different place.");
            fire();
        }
        if(shipGrid[xCoords][yCoords].equals("6"))
        {
            shipGrid[xCoords][yCoords] = "-1";
            System.out.print("hit! ");
    
            if(isShipSunk("6"))
            {
                System.out.println("You sunk the Destroyer.");
                shipsLeft--;
            }
            System.out.println();
        }
        if(shipGrid[xCoords][yCoords].equals("5"))
        {
            shipGrid[xCoords][yCoords] = "-1";
            System.out.print("hit! ");
    
            if(isShipSunk("5"))
            {
                System.out.println("You sunk the Carrier.");
                shipsLeft--;
            }
            System.out.println();
        }
        if(shipGrid[xCoords][yCoords].equals("4")) //check if each ship is hit
        {
            shipGrid[xCoords][yCoords] = "-1";
            System.out.print("hit! ");
            
            if(isShipSunk("4"))
            {
                System.out.println("You sunk the Battleship.");
                shipsLeft--;
            }
            System.out.println();
        }
        if(shipGrid[xCoords][yCoords].equals("3"))
        {
            shipGrid[xCoords][yCoords] = "-1";
            System.out.print("hit! ");

            if(isShipSunk("3"))
            {
                System.out.println("You sunk the Submarine.");
                shipsLeft--;
            }
            System.out.println();
        }
        if(shipGrid[xCoords][yCoords].equals("2"))
        {
            shipGrid[xCoords][yCoords] = "-1";
            System.out.print("hit! ");

            if(isShipSunk("2"))
            {
                System.out.println("You sunk the Patrol Boat.");
                shipsLeft--;
            }
            System.out.println();
        }
        else if(shipGrid[xCoords][yCoords].equals("0"))
        {
            shipGrid[xCoords][yCoords] = "-5";
            System.out.println("miss");
            System.out.println();
            moves--;
        }
    }
    public int getMoves()
    {
        return moves;
    }
    private boolean isShipSunk(String shipNumber) //check if the ship number just hit is on any square
    {
        for (int i = 1; i < shipGrid.length; i++) 
        {
		    for (int j = 1; j < shipGrid.length; j++)
		        if (shipGrid[i][j].equals(shipNumber))
					return false;
        }
		return true;	
    }
    public void printShipsLeft()
    {
        String[] shipNames = {"", "", "Patrol Boat", "Submarine", "Battleship", "Carrier", "Destroyer"};
        System.out.println("Ships left:");
        for(int i = 2; i < 7; i++)
        {
            if(isShipSunk(i + ""))
                System.out.print("[X] ");
            else
                System.out.print("[ ] ");
            System.out.println(shipNames[i]);
        }
    }
    public void printBoard() //grid just to show where hit/miss
    {
        for(int i = 0; i < shipGrid.length; i++)
        {
            for(int j = 0; j < shipGrid.length; j++)
            {
                if(shipGrid[i][j].equals("-1"))
                    System.out.print("[X]");
                else if(shipGrid[i][j].equals("-5"))
                    System.out.print("[O]");
                else
                    System.out.print("[" + hitGrid[i][j] + "]");
            }
            System.out.println();
        }
    }
    public boolean gameisLost()
    {
        if(moves == 0) //lose condition
            return true;
        return false;
    }
    public boolean gameisWon()
    {
        if(shipsLeft == 0) //win condition
            return true;
        return false;
    }
    public static String[][] getBoard()
    {
        return shipGrid;
    }
}