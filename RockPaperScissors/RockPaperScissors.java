import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
        this("");
	}
	public RockPaperScissors(String player)
	{
        String[] choices = {"R", "P", "S"};
        playChoice = player;
        compChoice = choices[(int)(Math.random() * 3)];  
	}
	public String determineWinner()
	{
		String winner="";
        if(compChoice.equals("R"))
        {
            if(playChoice.equals("P"))
                winner = "!Player wins <<Paper Covers Rock>>!";
            else if(playChoice.equals("S"))
                winner = "!Computer wins <<Rock Breaks Scissors>>!";
            else
                winner = "!Draw Game!";
        }

        if(compChoice.equals("P"))
        {
            if(playChoice.equals("R"))
                winner = "!Computer wins <<Paper Covers Rock>>!";
            else if(playChoice.equals("S"))
                winner = "!Player wins <<Scissors Cuts Paper>>!";
            else
                winner = "!Draw Game!";
        }

        if(compChoice.equals("S"))
        {
            if(playChoice.equals("R"))
                winner = "!Player wins <<Rock Breaks Scissors>>!";
            else if(playChoice.equals("P"))
                winner = "!Computer wins <<Scissors Cuts Paper>>!";
            else
                winner = "!Draw Game!";
        }
		return winner;
	}

	public String toString()
	{
        String output = "player had " + playChoice + "\nComputer had " + compChoice;
		return output;
	}
}