public class USS
{
    private boolean facePort;
    private boolean faceStarboard;
    private boolean faceBow;
    private boolean faceStern;
    private static int[][] tempOceania = new int[9][9]; //needs to be accessible at class level
    private static double health; //needs to be accessible at class level
    private static double feet;     //put this here to use in the health method, because int length that was passed to the constructor stays there, and i need a variable that's accessible at the class level
    public USS(int length)
    {
        // int[] footer = new int[length];
        // for (int numer: footer)  
        // {
            // footer[numer]=0; 
        // }
        // obtainGridGrain(placeShip(length, Battleship.getOceania()));
        // int[][] tempOceania = new int[8][8];
        // obtainGridGrain(placeShip(length, Battleship.getOceania()));
        System.out.println("i'm creating ship of length " + length);
        feet = length;
        tempOceania = placeShip(length, Battleship.getOceania());
        int[] damageControl = new int[length];
        health = 100; //lol they all start at one hundred health
        
        
        System.out.println("this is oceania updated with most recent ship");
        for (int drewBot=0; drewBot <= 8; drewBot++)
        {
            for (int zoBot=0; zoBot <=8; zoBot++)
            {
                System.out.print("|" + tempOceania[drewBot][zoBot] + "|");
            }
            System.out.println(" ");
        }
        // for (int i=1; i<length-1; i++)
        // {
            
            // footer[i] = footer[i-1] + direction();
        // }
    }
    
    public static int[][] obtainGridGrain() //getTempOceania
    {
        return tempOceania;
        //essentially a getter
    }
    
    public void shotTaken() //setHealth
    {
        health = health - (100.00/feet);
        //essentially this a setter
    }
    
    //put this method in battleship instead
    // public boolean isAfloat()
    // {
        // return true;
    // }
    
    public double healthReport() //getHealth
    {
        return health; 
        //essentially this is a getter
    }
    
    private int[][] placeShip(int len, int[][] oceaniaPlus)
    {
        facePort = false;
        faceStarboard = false;
        faceBow = false;
        faceStern = false; 
        // those are all set to false at first so that placeShip method only sets one direction boolean to true. this way later in canPlaceShip, only one boolean will be true and it'll correspond to the direction that was randomized to it in this placeShip method
        int startC;
        int startR; //declared here, will differ depending on parameters each direction has for index
        //int[][] updatedOceania = new int[8][8];
        //that was stupid^^^^^
        //these booleans are unneccessary because I could just randomize using these numbers, but the boolean variables make it easier to see what it's doing because it's labelled. in my opinion.
        //System.out.println("len is " + len);
        int direct = (int)(Math.random() * 4); //randomizes the direction to north, south, east, west
        if (direct==0)
        {
            facePort = true; 
            //System.out.println("port"); // left !
            //must start in column bigger than 8 minus length
            do //randomizes column and rows according to index of direction
            {
                startC = (int)(Math.random() * len) + (8-len + 1); 
                //System.out.println("column above, row below");
                startR = (int)(Math.random() * 8);
            }  
            while (!(canPlaceShip(startC, startR, oceaniaPlus, len))); //while it can place ship
            // while (!(oceaniaPlus[startC][startR] == 0)); 
            // instead of above, i chose to make a method because it has to loop depending on the direction the ship is facing
            for (int jackay = startC; jackay > startC - len; jackay--)
            {
                //System.out.println("filling grid!");
                oceaniaPlus[startR][jackay] = len; //was multiplying times 11 and was going to check it based on length but didn't  
            }
        }
        else if (direct==1)
        {
            faceStarboard = true;
            //System.out.println("starboard");  //right!!
            //column must be o to 8-len
            do //randomizes column and row according to direction index
            {
                startC = (int)(Math.random() * (8-len)); 
                //System.out.println("column above, row below");
                startR = (int)(Math.random() * 8);
            }
            while (!(canPlaceShip(startC, startR, oceaniaPlus, len)));
            for (int jakeeks = startC; jakeeks < startC + len; jakeeks++)
            {
                //System.out.println("filling grid!");
                oceaniaPlus[startR][jakeeks] = len;
            }
        }
        else if (direct==2)
        {
            faceBow = true;
            //System.out.println("bow"); // north, up
            //row must be starting at bottom and not go off the grid
            do //randomizes column and row according to direction-specific index that keeps it on grid
            {
                startC = (int)(Math.random() * 8);
                //System.out.println("column above, row above");
                startR = (int)(Math.random() * (len)) + (8 - len + 1);
            }
            while (!(canPlaceShip(startC, startR, oceaniaPlus, len)));
            for (int jahky = startR; jahky > startR - len; jahky--)
            {
                //System.out.println("filling grid!");
                oceaniaPlus[jahky][startC] = len;
            }
        }
        else if (direct==3)
        {
            faceStern = true;
            //System.out.println("stern"); //south, down
            //row starts at top and can't go off the grid at the bottom
            do //randomizes column and row. specific to direction, makes sure that it stays on grid
            {    
                startC = (int)(Math.random() * 8);
                //System.out.println("column above, row above");
                startR = (int)(Math.random() * (8 - len));
            }
            while (!(canPlaceShip(startC, startR, oceaniaPlus, len)));
            for (int jqq = startR; jqq < startR + len; jqq++)
            {
                //System.out.println("filling grid!");
                oceaniaPlus[jqq][startC] = len;
            }
        }
        return oceaniaPlus;
    }
    
    private boolean canPlaceShip(int cStart, int rStart, int[][] grid, int lennie)
    {   
        //this method checks if you CAN or CANT place ship, when it comes to seeing if the grid has the space, or slots filled with 0, to see if the ship can go there
        //System.out.println("lennie is " + lennie);
        if (facePort) //left! different from horizontal right because for the real game it would start and go one way, which shows the different ways it faces
        {
            for (int lov = cStart; lov >= cStart - lennie; lov--)
            {
               //System.out.println("facePort");
               //System.out.println(grid[rStart][lov]);
               if (!(grid[rStart][lov] == 0))
                    return false;
            }
            return true;
        }
        if (faceStarboard) //right! different from horizontal left because it faces different way in new game
        {
            for (int kov = cStart; kov <= cStart + lennie; kov++)
            {
                //System.out.println("faceStarboard");
                //System.out.println(grid[rStart][kov]);
                if (!(grid[rStart][kov] == 0))
                    return false;
            }
            return true;
        }
        if (faceBow) //faces up (north), different from stern because it starts at bottom coordinate and fills up
        {
            for (int ya = rStart; ya >= rStart - lennie; ya--)
            {
                //System.out.println("faceBow");
                //System.out.println(grid[ya][cStart]);
                if (!(grid[ya][cStart] == 0))
                    return false;
            }
            return true;
        }
        if (faceStern) //faces down (south), different from bow because it starts at top and fills down
        {
            for (int fya = rStart; fya <= rStart + lennie; fya++)
            {
                //System.out.println("faceStern");
                //System.out.println(grid[fya][cStart]);
                if (!(grid[fya][cStart] == 0))
                    return false;
            }
            return true;
        }
        return false;
    }           
}