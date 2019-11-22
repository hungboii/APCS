public class ShipMaker
{
    private static int[][] board = new int[8][8];

    public ShipMaker()
    {
        makeShip();    
    }
    public void makeShip() // where int j = ship length
    {
        int shipsLeft = 5;
        while(shipsLeft > 0)
        {
            int xLoc = (int)(Math.random()*8); //randomize the Row
            int yLoc = (int)(Math.random()*8);// randomize the column
            int yDir = (int)(Math.random()*4);// randomize the cardinal direction in which the ship faces
            switch(yDir)
            {
                case 0: //make ship point north
                    if(canPlaceShip(shipsLeft+1, xLoc, yLoc, 0))
                    {
                        for(int i = 0; i<shipsLeft+1; i++)
                        {
                            board[yLoc-i][xLoc] = shipsLeft+1;
                        }
                            shipsLeft--;
                        }
                    break;

                case 1: //make ship point south
                    if(canPlaceShip(shipsLeft+1, xLoc, yLoc, 1))
                    {    
                        for(int i = 0; i<shipsLeft+1; i++)
                        {
                            board[yLoc + i][xLoc] = shipsLeft+1;
                        }
                        shipsLeft--;
                    }
                    break; 

                    case 2: //make ship point east
                        if(canPlaceShip(shipsLeft+1, xLoc, yLoc, 2))
                        {      
                            for(int i = 0; i<shipsLeft+1; i++)
                            {
                                board[yLoc][xLoc + i] = shipsLeft+1;
                            }
                            shipsLeft--;
                        }
                        break;

                    case 3: // make ship point west
                        if(canPlaceShip(shipsLeft+1, xLoc, yLoc, 3))
                        {      
                            for(int i =0; i<shipsLeft + 1; i++)
                            {
                                board[yLoc][xLoc - i] = shipsLeft+1;
                            }
                            shipsLeft--;
                        }   
                        break;

                    default:
                        System.out.print("Bruh");
                }
            }
        }
    
        private boolean canPlaceShip(int shiplength, int xCoord, int yCoord, int direction)
        {
            if(direction == 0)
            {
                if(yCoord - shiplength < -1)
                {
                    return false;
                }
                for(int i = 0; i < shiplength; i++)
                {
                    if(board[yCoord - i][xCoord] != 0)
                    {
                        return false;
                    }
                }
            }
            if(direction == 1)
            {
                if(yCoord + shiplength > 8)
                {
                    return false;
                }
                for(int i = 0; i < shiplength; i++)
                {
                    if(board[yCoord + i][xCoord] != 0)
                    {
                        return false;
                    }
                }
            }
            if(direction == 2)
            {
                if( xCoord + shiplength > 8)
                {
                    return false;
                }
                for(int i = 0; i < shiplength; i++)
                {
                    if(board[yCoord][xCoord + i] != 0)
                    {
                        return false;
                    }
                }
            }
            if(direction == 3)
            {
                if( xCoord - shiplength < -1)
                {
                    return false;
                }
                for(int i = 0; i < shiplength; i++)
                {
                    if(board[yCoord][xCoord - i] != 0)
                    {
                        return false;
                    }
                }
            }
            return true;
        }

        public int[][] getBoard()
        {
            return board;
        }
}