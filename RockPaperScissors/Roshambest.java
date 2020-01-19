import java.util.Scanner;
import static java.lang.System.*;

public class Roshambest
{
	private int playChoice;
    private int compChoice;
    private String[] weapons = new String[3];

	public Roshambest(int player)
	{
        weapons = new String[] {"R", "P", "S"};
        playChoice = player;
        compChoice = (int)(Math.random() * 3);  
    }
	public String determineWinner2()
	{
        String[][] winner = { //   R              P                 S 
                            {"Draw Game!", "Computer wins!", "Player Wins!"}, //R
                            {"Player Wins!", "Draw Game!", "Computer wins!"}, //P
                            {"Computer wins!", "Player Wins!", "Draw Game!"}  //S
                            };
        
		return winner[playChoice][compChoice]; 
	}
	public String toString()
	{
        String output = "player had " + weapons[playChoice] + "\nComputer had " + weapons[compChoice];
		    return output;
	}
}