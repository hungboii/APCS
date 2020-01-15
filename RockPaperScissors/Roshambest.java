import java.util.Scanner;
import static java.lang.System.*;

public class Roshambest
{
	private int playChoice;
    private int compChoice;
    private int[] choices = new int[3];
    private String[] weapons = new String[3];
    private String weepon;

	public Roshambest(int player, String weapon)
	{
        choices = new int[] {3, 4, 5}; //1 is rock, 2 is paper, 3 is scissors for player
        weapons = new String[] {"P", "R", "S"};
        playChoice = player;
        compChoice = choices[(int)(Math.random() * 3)];  
        weepon = weapon;
    }
	public String determineWinner2()
	{
        String winner = "";
        
        if(compChoice + playChoice == 6) //1 check minimum
        {
            winner = "Player wins!";
        }
        else if(compChoice + playChoice == 7 || compChoice + playChoice == 4) //3 checks max
        {
            winner = "Computer wins!";
        }
        else //can get 2 if figure out values for draw
        {
            winner = "Draw Game!";
        }
		return winner; 
	}

	public String toString()
	{
        String output = "player had " + weepon + "\nComputer had " + weapons[compChoice - 3];
		    return output;
	}
}