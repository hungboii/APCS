import java.util.Scanner;
import java.util.Arrays;
public class Battleship
{
    private String[][] boatGrid = new String[9][9];
    private String[][] hitGrid = new String[9][9];
    private int yCoords;
    private int boatsLeft;
    private int moves;

    public Battleship(String[][] dummy, int numMoves)
    {
        boatGrid = dummy;
        boatsLeft = 4;
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
        char[] sepCoords = coords.toCharArray();
        String yCords = sepCoords[0] + "";
        String xCords = sepCoords[1] + "";

        int xCoords = Integer.parseInt(xCords);

        switch(yCords)
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
        }
        System.out.println();

        if(boatGrid[xCoords][yCoords].equals("-5") || boatGrid[xCoords][yCoords].equals("-1")) //check if player already shot in this place
        {
            System.out.println("You already shot there, you monkey. Pick a different place.");
            fire();
        }
        if(boatGrid[xCoords][yCoords].equals("4")) //check if each boat is hit
        {
            boatGrid[xCoords][yCoords] = "-1";
            System.out.println("hit");
            System.out.println();
            
            if(isShipSunk("4"))
                System.out.println("You sunk a boat! Boats left: " + boatsLeft);
        }
        if(boatGrid[xCoords][yCoords].equals("3"))
        {
            boatGrid[xCoords][yCoords] = "-1";
            System.out.println("hit");
            System.out.println();

            if(isShipSunk("3"))
                System.out.println("You sunk a boat! Boats left: " + boatsLeft);
        }
        if(boatGrid[xCoords][yCoords].equals("2"))
        {
            boatGrid[xCoords][yCoords] = "-1";
            System.out.println("hit");
            System.out.println();

            if(isShipSunk("2"))
                System.out.println("You sunk a boat! Boats left: " + boatsLeft);
        }
        if(boatGrid[xCoords][yCoords].equals("1"))
        {
            boatGrid[xCoords][yCoords] = "-1";
            System.out.println("hit");
            System.out.println();
    
            if(isShipSunk("1"))
                System.out.println("You sunk a boat! Boats left: " + boatsLeft);
        }
        else if(boatGrid[xCoords][yCoords].equals("0"))
        {
            boatGrid[xCoords][yCoords] = "-5";
            System.out.println("miss");
            System.out.println();
        }
    }
    public int getMoves()
    {
        return --moves;
    }
    private boolean isShipSunk(String boatNumber) //check if the boat number just hit is on any square
    {
        for (int i = 1; i < boatGrid.length; i++) 
        {
		    for (int j = 1; j < boatGrid.length; j++)
		        if (boatGrid[i][j].equals(boatNumber))
					return false;
        }
        boatsLeft--;
		return true;	
    }
    public void printBoard()
    {
        for(int i = 0; i < boatGrid.length; i++)
        {
            for(int j = 0; j < boatGrid.length; j++)
            {
                if(boatGrid[i][j].equals("-1"))
                    System.out.print("[X]");
                else if(boatGrid[i][j].equals("-5"))
                    System.out.print("[O]");
                else
                    System.out.print("[" + hitGrid[i][j] + "]");
            }
            System.out.println();
        }
    }
    public boolean gameisWon()
    {
        
        return false;
    }
    public boolean gameisOver()
    {
        if(moves == 0) //lose condition
        {
            System.out.print("Imagine losing to the bot lmao");
            return true;
        }
        if(boatsLeft == 0) //win condition
        {
            System.out.print("Congrats, you win!");
            return true;
        }
        return false;
    }
}