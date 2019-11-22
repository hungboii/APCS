import java.util.Scanner;
public class Battleship
{
    private int [][] board = new int[8][8];
    private int xCoord;
    private int yCoord;

    public Battleship(int[][] grid)
    {
        board = grid;
    }
    
    public void takeGuess()
    {
        System.out.print("Please pick your row # : ");
        Scanner kb = new Scanner(System.in);
        xCoord = kb.nextInt();
        System.out.print("Please choose a Y coordinate :");
        yCoord = kb.nextInt();
        if(hit(xCoord, yCoord) == true)
        {
            System.out.println("hit");
        }
        else
        {
        System.out.println("miss");
        }
    }

        public boolean hit(int x, int y)
        {
            if(board[x][y] == 6 ||board[x][y] == 5 || board[x][y] == 4 || board[x][y] == 3 || board[x][y] == 2 )
            { 
                board[x][y] = -400;
                return true;
            }
            else
            {
                board[x][y] = 12;
                return false; 
            }
        }

        public void printBoard()
        {
            for(int i= 0; i<board.length; i++)
            {
                for(int j = 0; j<board.length; j++)
                {
                    if(board[i][j] == -400) 
                    {
                        System.out.print("[X]");
                    }
                    else if(board[i][j] == 12)
                    {
                        System.out.print("[O]");
                    }
                    else
                    {
                        System.out.print("[ ]");
                    }
                }   
            System.out.println("");
            }

        }  

        
      

        public boolean gameOver()
        {
            for(int i = 0; i <board.length; i++)
            {
                for(int j = 0; j<board.length; j++)
                {
                    if(board[i][j] == 6 ||board[i][j] == 5 || board[i][j] == 4 || board[i][j]== 3 || board[i][j] == 2)
                    {
                        return false;
                    }
                }
            }
            return true; 
        }
}     

