import java.util.Scanner;
import java.util.Arrays;
public class Battleship
{
    private String[][] boatGrid = new String[9][9];
    private String[][] hitGrid = new String[9][9];
    private int yCoords;

    public Battleship(String[][] dummy)
    {
        boatGrid = dummy;

        for(String[] rows : hitGrid)
        {
            Arrays.fill(rows, " ");
        }
        for (int i = 0; i < hitGrid.length; i++)                       
            hitGrid[0][i] = (char)(64 + i) + ""; 

        for (int i = 1; i < hitGrid.length; i++)                        
            hitGrid[i][0] = i + "";
    }
    public void fire()
    {
        int i = 0;
        if(i == 0)
            System.out.println("Enter coordinates in this format - A1");
        i++;
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

        if(boatGrid[xCoords][yCoords].equals("4"))
        {
            boatGrid[xCoords][yCoords] = "-1";
            System.out.println("hit");
            System.out.println();
        }
        else if(boatGrid[xCoords][yCoords].equals("0"))
        {
            boatGrid[xCoords][yCoords] = "-5";
            System.out.println("miss");
            System.out.println();
        }
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
    public boolean gameisOver()
    {
        for(int i = 0; i < boatGrid.length; i++)
        {
            for(int j = 0; j < boatGrid.length; j++)
            {
                if(boatGrid[i][j].equals("4"))
                    return false;
            }
        }
        return true;
    }
}