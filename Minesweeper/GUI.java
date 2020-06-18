import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame
{
    private JFrame win; 

    private int xCoord = -100;
    private int yCoord = -100;
    private int spacing = 5;

    private int faceX = 605;
    private int faceY = 5;

    private int leftMouse = MouseEvent.BUTTON1_DOWN_MASK; //used to detect if both buttons are down - taken from online 
    private int rightMouse = MouseEvent.BUTTON3_DOWN_MASK; //same as above
    private boolean bothDown = false;

    private int[][] mines = new int[16][9];
    private int[][] neighbors = new int[16][9];
    private boolean[][] revealed = new boolean[16][9];
    private boolean[][] flagged = new boolean[16][9];
    private int numMines = 20;
    private int numRevealed = 0;
    private ArrayList<Mine> mineLocs = new ArrayList<Mine>();
    private int numFlagged;

    //private int wrongFlagX;
    //private int wrongFlagY;

    private Date startDate = new Date();
    private int timerX = 1150;
    private int timerY = 7;
    private int time;
    private int finalTime;

    private int mineCountX = 20;
    private int mineCountY = 12;
    private int minesLeft = 20;

    private boolean winStatus = false;
    private boolean gameOver = false;

    public GUI()
    {
        initUI();
    } 
    public void initUI()
    {
        win = new JFrame();
        win.setTitle("Minesweeper");
        win.setSize(1296, 839);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        win.setVisible(true);   

        newGame();
        
        Board mine = new Board(mines);
        neighbors = mine.getNumMinesAround();

        JPanel board = (JPanel)win.getContentPane();
        win.setContentPane(board);

        MouseReader move = new MouseReader();
        win.addMouseListener(move);

        /*
        for the smiley face button to reset
        JButton smiley = new JButton("Click here");
        JButton smiley = new JButton();
        ImageIcon icon = new ImageIcon("smiley.png");
        smiley.setBounds(615, 14, 50, 55);

        win.add(smiley);

        //resize image to fit in button
        Image img = icon.getImage();  
        Image resizedImage = img.getScaledInstance(55, 55, java.awt.Image.SCALE_SMOOTH);  
        smiley.setIcon(new ImageIcon(resizedImage));

        //add reset when clicked
        smiley.addActionListener(new ActionListener());
        */
        repaint();
    }

    public void newGame()
    {
        //System.out.println("resetting");
        for(int i = 0; i < 16; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                mines[i][j] = 0;
                revealed[i][j] = false;
                flagged[i][j] = false;
                numMines = 20;
                minesLeft = 20;
            }
        }
        int x, y;
        //System.out.println("placing mines");
        while(numMines > 0)
        {
            x = (int) (Math.random() * 16);
            y = (int) (Math.random() * 9); 
            if(mines[x][y] != 1) //make sure bombs are not placing on top of each other
            {
                mines[x][y] = 1;
                mineLocs.add(new Mine(x, y));
                numMines--;
            }
        }
        /*
        for(int i = 0; i < 16; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                System.out.print(mines[i][j] + " ");
            }
            System.out.println();
        }
        */
        //wrongFlagX = 0;
        //wrongFlagY = 0;
        time = 0;
        startDate = new Date();
        numRevealed = 0;
        winStatus = false;
        gameOver = false;
        Board mine = new Board(mines);
        neighbors = mine.getNumMinesAround();

        /*
        for(int i = 0; i < 16; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                System.out.print(neighbors[i][j] + " ");
            }
            System.out.println();
        }
        */
    }

    public void paintComponent(Graphics g) //most of this i got from the graphics project, but some things like drawString(Integer.toString()) i got from online
    {
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0, 0, 1280, 800);
        for(int i = 0; i < 16; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                g.setColor(Color.GRAY);

                /*
                if(mines[i][j] == 1) //checking mines are placing
                {
                    g.setColor(Color.YELLOW);
                } 
                */
                if(revealed[i][j] == true)
                {
                    g.setColor(Color.WHITE);
                    //g.setColor(Color.YELLOW);
                    if(mines[i][j] == 1)
                        g.setColor(Color.red);
                }
                /*
                else if(flagged[i][j] == true)
                {
                    g.setColor(Color.GREEN);
                }
                */

                g.fillRect(spacing + i * 80, spacing + j * 80 + 80, 80 - (2 * spacing), 80 - (2 * spacing));

                if(flagged[i][j] == true) //draw flag
                {
                    g.setColor(Color.BLACK);
                    g.fillRect(i*80+38, j*80+100, 5, 40);
                    g.fillRect(i*80+24, j*80+135, 30, 10);
                    g.setColor(Color.RED);
                    g.fillRect(i*80+24, j*80+100, 20, 13);
                }
                /*
                if(i == wrongFlagX && i != 0 && j == wrongFlagY && j != 0)
                {
                    System.out.println("drawingline");
                    g.setColor(Color.BLACK);
                    g.fillRect(i*80+38, j*80+100, 5, 40);
                    g.fillRect(i*80+24, j*80+135, 30, 10);
                    g.setColor(Color.RED);
                    g.fillRect(i*80+24, j*80+100, 20, 13);

                    g.setColor(Color.RED);
                    g.drawLine(i*80 + 20, j*80 + 70, i*80 + 58, j*80 + 150); //left top right bottom
                    g.drawLine(i*80 + 20, j*80 + 150, i*80 + 58, j*80 + 70);

                }
                */
                if(revealed[i][j] == true) // possibly add diff colors for each number - just add if statements here
                {
                    g.setColor(Color.BLACK);
                    if(mines[i][j] == 0) //if not a mine
                    {
                        //numRevealed++;
                        if(neighbors[i][j] == 0) //if a blank square, reveal everything around it too
                        {   
                            for(int row = i - 1; row <= i + 1; row++)
                            {
                                for(int col = j - 1; col <= j + 1; col++)
                                {   
                                    if(row == -1 || row == 16 || col == -1 || col == 9)
                                        continue;
                                    else if(mines[row][col] == 0)
                                        revealed[row][col] = true;
                                }
                            }
                            g.setColor(Color.WHITE); //blank box for 0s
                        }
                        g.setFont(new Font("Comic Sans", Font.BOLD, 40));
                        g.drawString(Integer.toString(neighbors[i][j]), i*80 + 27, j*80 + 80 + 55);
                        //g.setColor(Color.YELLOW);
                    }
                    else //draw all the mines and dispaly lose message
                    {
                        
                        for(int k = 0; k < 16; k++)
                        {
                            for(int h = 0; h < 9; h++)
                            {
                                if(mines[k][h] == 1)
                                {
                                    revealed[k][h] = true;
                                    /*
                                    g.setColor(Color.red);
                                    g.fillRect(spacing + k * 80, spacing + h * 80 + 80, 80 - (2 * spacing), 80 - (2 * spacing));
                                    g.setColor(Color.BLACK);
                                    g.fillOval(k * 80 + 21, h * 80 + 80 + 23, 35, 35); //draw mine
                                    */
                                }
                            }
                        }
                        g.setColor(Color.RED);
                        g.fillRect(spacing + i * 80, spacing + j * 80 + 80, 80 - (2 * spacing), 80 - (2 * spacing));
                        g.setColor(Color.BLACK);
                        g.fillOval(i * 80 + 21, j * 80 + 80 + 23, 35, 35); //draw mine
                        //winStatus = false;
                        gameOver = true;
                        //endGame();
                    }
                }
                /* if(xCoord >= spacing + i * 80 && xCoord < spacing + i * 80 + 80 - 2 * spacing && yCoord >= spacing + j*80 + 80 + 26 && yCoord < spacing + j * 80 + 80 + 80 + 26 - 2 * spacing) //mouse testing
                {
                    //System.out.println(xCoord);
                    g.setColor(Color.red);
                } 
                if(numRevealed == 124) //if all squares exluding mines are revealed, 144 total squares - 20 mines = 120
                {
                    winStatus = true;
                    gameOver = true;
                }
                */
            }
        }
        //drawing the outline and eyes of the face
        g.setColor(Color.YELLOW);
        g.fillOval(faceX, faceY + 3, 60, 60);
        g.setColor(Color.BLACK);
        g.fillOval(faceX + 13, faceY + 19, 10, 10); //eyes
        g.fillOval(faceX + 37, faceY + 19, 10, 10);

        //draw smiley face
        if(winStatus == false && gameOver == false)
        {
            g.fillRect(faceX + 19, faceY + 49, 22, 5 );
            g.fillRect(faceX + 14, faceY + 44, 5, 5);
            g.fillRect(faceX + 41, faceY + 44, 5, 5);
            g.fillRect(faceX + 9, faceY + 39, 5, 5);
            g.fillRect(faceX + 46, faceY + 39, 5, 5);
        }
        //draw sad face
        else if(winStatus == false && gameOver) 
        {
            //System.out.println("You lose!");
            g.fillRect(faceX + 19, faceY + 39, 22, 5 );
            g.fillRect(faceX + 14, faceY + 44, 5, 5);
            g.fillRect(faceX + 41, faceY + 44, 5, 5);
            g.fillRect(faceX + 9, faceY + 49, 5, 5);
            g.fillRect(faceX + 46, faceY + 49, 5, 5);


            /*
            if(what < 1)
            {
                JOptionPane.showMessageDialog(win, "you lose", "Test", JOptionPane.INFORMATION_MESSAGE);
                what++;
            }
            */
            //add "you lose" message  - have window pop up or just print it along the top?
        }
        //draw sunglasses face
        if(areAllFlagsCorrect())
        {
            //System.out.println("you win!");
            winStatus = true;
            gameOver = true;
            
            g.fillRect(faceX + 19, faceY + 49, 22, 5 ); //smile
            g.fillRect(faceX + 14, faceY + 44, 5, 5);
            g.fillRect(faceX + 41, faceY + 44, 5, 5);

            g.fillRect(faceX + 11, faceY + 17, 39, 5); //glasses frames
            g.fillRect(faceX + 11, faceY + 22, 17, 9);
            g.fillRect(faceX + 33, faceY + 22, 17, 9);

            g.fillRect(faceX + 6, faceY + 22, 5, 5); //glasses
            g.fillRect(faceX + 50, faceY + 22, 5, 5);
            g.fillRect(faceX + 1, faceY + 27, 5, 5);
            g.fillRect(faceX + 55, faceY + 27, 5, 5);
        }
        //minecounter
        g.setColor(Color.BLACK);
        g.fillRect(mineCountX, mineCountY - 5, 100, 70);
        g.setColor(Color.RED);
        g.setFont(new Font("Comic Sans", Font.PLAIN, 70));
        g.drawString(Integer.toString(minesLeft), mineCountX + 10, mineCountY + 55);

        //timer
        g.setColor(Color.BLACK);
        g.fillRect(timerX - 20, timerY, 140, 70);
        finalTime = time; //storing the old time
        g.setColor(Color.RED);

        if(gameOver == true) 
        {
            g.drawString(Integer.toString(finalTime), timerX -12, timerY + 60);
        }
        else
        {
            time = (int)((new Date().getTime() - startDate.getTime()) / 1000);
            g.drawString(Integer.toString(time), timerX -12, timerY + 60);
        }

        repaint();

    }
    /*
    public void endGame()
    {
        if(winStatus == false)
        {
            //draw dead face

            System.out.println("You lose!");
        }
        else
        {
            //draw glasses face
        }

    }
    */

    public class MouseReader implements MouseListener //taken from online
    {
        @Override
        public void mousePressed(MouseEvent e) 
        {
            xCoord = e.getX();
            yCoord = e.getY();

            int both = leftMouse | rightMouse;
            bothDown = (e.getModifiersEx() & both) == both;

            //System.out.println("X: " + xCoord + ", Y: " + yCoord );

            if(inSmiley())
            {
                //System.out.println("in smiley face");
                newGame();
            }
        }

        @Override
        public void mouseReleased(MouseEvent e) 
        {
            int x = inBoxX();
            int y = inBoxY();

            if(x != -1 && y != -1 && e.getButton() == MouseEvent.BUTTON1) //box clicked on is revealed if left clicked
            {
                if(bothDown)
                {
                    //System.out.println("Both pressed");
                    if((isFlagged(x, y) == neighbors[x][y]) && areFlagsCorrect(x, y)) //flagged correct amount, and they are correct
                    {
                        for(int row = inBoxX() - 1; row <= inBoxX() + 1; row++)
                        {
                            for(int col = inBoxY() - 1; col <= inBoxY() + 1; col++)
                            {   
                                if(row == -1 || row == 16 || col == -1 || col == 9)
                                    continue;
                                else if(mines[row][col] != 1)
                                {
                                    revealed[row][col] = true;
                                    numRevealed++;
                                }
                            }
                        }
                    }
                    else if(isFlagged(x, y) < neighbors[x][y]) //havent flagged enough of yet, nothing happens
                    {

                    }
                    else //double clicked but flags are wrong - lose
                    {
                        //wrongFlagX = findIncorrectSquare(x, y).getXCoord();
                        //wrongFlagY = findIncorrectSquare(x, y).getYCoord();

                        //System.out.println(wrongFlagX + ", " + wrongFlagY);

                        for(int row = x - 1; row <= x + 1; row++)
                        {
                            for(int col = y - 1; col <= y + 1; col++)
                            {   
                                if(row == -1 || row == 16 || col == -1 || col == 9)
                                    continue;
                                revealed[row][col] = true;
                                numRevealed++;
                            }
                        }
                    }
                }
                else
                {
                    if(flagged[x][y] == true) //if already flagged
                    {
                        flagged[x][y] = false; 
                        minesLeft++;
                    }
                    revealed[x][y] = true; 
                    numRevealed++;
                    //System.out.println("in box " + inBoxX() + ", " + inBoxY());
                }
            }
            else if(x != -1 && y != -1 && e.getButton() == MouseEvent.BUTTON3) //box clicked on is flagged if right clicked
            {
                //System.out.println("right clikc");
                if(flagged[x][y] == true) //if already flagged
                {
                    flagged[x][y] = false; 
                    minesLeft++;
                }
                else if(revealed[x][y] == true) //in case user tries to flag a number square
                {
                        
                }
                else
                {
                    flagged[x][y] = true; 
                    minesLeft--;
                }
                //System.out.println("in box " + inBoxX() + ", " + inBoxY());
            }
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub

        }
        @Override
        public void mouseEntered(MouseEvent e) {
            // TODO Auto-generated method stub

        }

        @Override
        public void mouseExited(MouseEvent e) {
            // TODO Auto-generated method stub

        }
    }

    public int isFlagged(int x, int y) //check if number of flags around a square is equal to the number
    {
        numFlagged = 0;

        for(int row = x - 1; row <= x + 1; row++)
        {
            for(int col = y - 1; col <= y + 1; col++)
            {  
                if(row == -1 || row == 16 || col == -1 || col == 9)
                    continue;
                if(flagged[row][col] == true)
                    numFlagged++;
            }
        }
        
        return numFlagged;
    }

    public boolean areFlagsCorrect(int x, int y)
    {
        ArrayList<Mine> mineLocations = new ArrayList<Mine>();
        for(int row = x - 1; row <= x + 1; row++)
        {
            for(int col = y - 1; col <= y + 1; col++)
            {  
                if(row == -1 || row == 16 || col == -1 || col == 9)
                    continue;
                else if(mines[row][col] == 1) 
                    mineLocations.add(new Mine(row, col)); //store location of all mines that are around the double clicked square
            }
        }
        for(Mine check : mineLocations) //then check if they are flagged 
        {
            if(flagged[check.getXCoord()][check.getYCoord()] == false)
                return false;
        }
        return true;
    }
    /*
    public Mine findIncorrectSquare(int x, int y)
    {
        ArrayList<Mine> numLocations = new ArrayList<Mine>();
        for(int row = x - 1; row <= x + 1; row++)
        {
            for(int col = y - 1; col <= y + 1; col++)
            {  
                if(row == -1 || row == 16 || col == -1 || col == 9)
                    continue;
                else if(mines[row][col] == 0 && revealed[row][col] == false) 
                    numLocations.add(new Mine(row, col)); //store location of all non-mines that are around the double clicked square
            }
        }
        for(Mine check : numLocations) //then check if they are flagged 
        {
            if(flagged[check.getXCoord()][check.getYCoord()] == true)
            {
                return check;
            }
        }
        return null;
    }
    */

    public boolean areAllFlagsCorrect()
    {
        
        for(Mine joe : mineLocs)
        {
            if(flagged[joe.getXCoord()][joe.getYCoord()] == false)
            {   
                //System.out.println("chcking");
                return false;
            }
        }
        //System.out.println("all good");

        return true;
    }

    public int inBoxX() //checking mouse is working correctly
    {
        for(int i = 0; i < 16; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                if(xCoord >= spacing + i * 80 && xCoord < spacing + i * 80 + 80 - spacing && yCoord >= spacing + j*80 + 106 && yCoord < spacing + j * 80 + 186 - spacing) //mouse testing
                {
                    return i;
                }
            }
        }
        return -1;
    }
    public int inBoxY()
    {
        for(int i = 0; i < 16; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                if(xCoord >= spacing + i * 80 && xCoord < spacing + i * 80 + 80 - spacing && yCoord >= spacing + j*80 + 106 && yCoord < spacing + j * 80 + 186 - spacing)
                {
                    return j;
                }
            }
        }
        return -1;
    }
    public boolean inSmiley()
    {
        if(xCoord >= faceX && xCoord <= faceX + 60 && yCoord >= faceY + 33 && yCoord <= faceY + 93)
        {
            return true;
        }
        return false;
    }
}
//605 < x < 665
//8 < y < 71