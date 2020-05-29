import java.util.Arrays;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Board 
{    
    private int[][] neighbors = new int[16][9];
    private int[][] minefield = new int[16][9];
    private int xCoords;
    private int yCoords;
    
    public Board(int[][] mines)
    {
        minefield = mines;
    }
    public int[][] getNumMinesAround()
    {
        int mineCount = 0;

        for(int i = 0; i < 16; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                if((i == 0 && j == 0) || (i == 0 && j == 8) || (i == 15 && j == 0) || (i == 15 && j == 8))
                {
                    numMinesAroundCorner(i, j);
                }

                else if(j == 0)
                {
                    if(minefield[i][j + 1] == 1)
                        mineCount++;
                    if(minefield[i + 1][j] == 1)
                        mineCount++;
                    if(minefield[i - 1][j] == 1)
                        mineCount++;
                    if(minefield[i - 1][j + 1] == 1)
                        mineCount++;
                    if(minefield[i + 1][j + 1] == 1)
                        mineCount++;
                    neighbors[i][j] = mineCount;
                }
                else if(i == 0)
                {
                    if(minefield[i][j + 1] == 1)
                        mineCount++;
                    if(minefield[i][j - 1] == 1)
                        mineCount++;
                    if(minefield[i + 1][j] == 1)
                        mineCount++;
                    if(minefield[i + 1][j - 1] == 1)
                        mineCount++;
                    if(minefield[i + 1][j + 1] == 1)
                        mineCount++;
                    neighbors[i][j] = mineCount;
                }
                else if(j == 8)
                {
                    if(minefield[i][j - 1] == 1)
                        mineCount++;
                    if(minefield[i + 1][j] == 1)
                        mineCount++;
                    if(minefield[i - 1][j] == 1)
                        mineCount++;
                    if(minefield[i - 1][j - 1] == 1)
                        mineCount++;
                    if(minefield[i + 1][j - 1] == 1)
                        mineCount++;
                    neighbors[i][j] = mineCount;
                }
                else if(i == 15)
                {
                    if(minefield[i][j + 1] == 1)
                        mineCount++;
                    if(minefield[i][j - 1] == 1)
                        mineCount++;
                    if(minefield[i - 1][j] == 1)
                        mineCount++;
                    if(minefield[i - 1][j - 1] == 1)
                        mineCount++;
                    if(minefield[i - 1][j + 1] == 1)
                        mineCount++;
                    neighbors[i][j] = mineCount;
                }
                else
                {
                    if(minefield[i][j + 1] == 1)
                        mineCount++;
                    if(minefield[i][j - 1] == 1)
                        mineCount++;
                    if(minefield[i + 1][j] == 1)
                        mineCount++;
                    if(minefield[i - 1][j] == 1)
                        mineCount++;
                    if(minefield[i + 1][j + 1] == 1)
                        mineCount++;
                    if(minefield[i + 1][j - 1] == 1)
                        mineCount++;
                    if(minefield[i - 1][j - 1] == 1)
                        mineCount++;
                    if(minefield[i - 1][j + 1] == 1)
                        mineCount++;
                    neighbors[i][j] = mineCount;
                }
                mineCount = 0;
            }
        }
        return neighbors;
    }
    private void numMinesAroundCorner(int row, int column) //for goddamn corners
    {
        int mineCount = 0;

        if(row == 0 && column == 0) //top left corner
        {
            if(minefield[row][column + 1] == 1) //right of corner
                mineCount++;
            if(minefield[row + 1][column] == 1) //below corner
                mineCount++;
            if(minefield[row + 1][column + 1] == 1) //diagnol of corner
                mineCount++;
            neighbors[row][column] = mineCount;
        }
        else if(row == 8 && column == 0) //bottom right corner
        {
            if(minefield[row][column + 1] == 1) //right of corner
                mineCount++;
            if(minefield[row + 1][column] == 1) //above corner
                mineCount++;
            if(minefield[row + 1][column + 1] == 1) //diagnol of corner
                mineCount++;
            neighbors[row][column] = mineCount;
        }
        else if(column == 15 && row == 0) //  top right corner
        {
            if(minefield[row][column - 1] == 1) //left
                mineCount++;
            if(minefield[row + 1][column] == 1) //below
                mineCount++;
            if(minefield[row + 1][column - 1] == 1) //diagnol
                mineCount++;
            neighbors[row][column] = mineCount;
            }
        else if(column == 15 && row == 8) //bottom right corner
        {
            if(minefield[row][column - 1] == 1) //left
                mineCount++;
            if(minefield[row - 1][column] == 1) //above
                mineCount++;
            if(minefield[row - 1][column - 1] == 1)//diagnol
                mineCount++;
            neighbors[row][column] = mineCount;
        }
    }
}

    