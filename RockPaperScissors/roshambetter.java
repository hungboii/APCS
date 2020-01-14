import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors(String player)
	{
        String[] choices = {"R", "P", "S"};
        playChoice = player;
        compChoice = choices[(int)(Math.random() * 3)];  
    }
    public RockPaperScissors()
	{
        this("");
    }
    // public String determineWinner()
	// {
    //     String winner="";
    //     if(compChoice.equals(playChoice))
    //         winner = "!Draw Game!";
    //     if(compChoice.equals("R"))
    //     {
    //         if(playChoice.equals("P"))
    //             winner = "!Player wins <<Paper Covers Rock>>!";
    //         else if(playChoice.equals("S"))
    //             winner = "!Computer wins <<Rock Breaks Scissors>>!";
    //     }

    //     if(compChoice.equals("P"))
    //     {
    //         if(playChoice.equals("R"))
    //             winner = "!Computer wins <<Paper Covers Rock>>!";
    //         else if(playChoice.equals("S"))
    //             winner = "!Player wins <<Scissors Cuts Paper>>!";
    //     }

    //     if(compChoice.equals("S"))
    //     {
    //         if(playChoice.equals("R"))
    //             winner = "!Player wins <<Rock Breaks Scissors>>!";
    //         else if(playChoice.equals("P"))
    //             winner = "!Computer wins <<Scissors Cuts Paper>>!";
    //     }
	// 	return winner;
    // }
    
	public String determineWinner2()
	{
        String winner = "";

        if(playChoice.equals(compChoice)) //1 checks least
            winner = "Draw Game!";

        else if(compChoice.equals("R"))
        {
            if(playChoice.equals("P"))
                winner = "Player wins!";
            else
                winner = "Computer wins!";
        }

        else if(compChoice.equals("P"))
        {
            if(playChoice.equals("S"))
                winner = "Player wins!";
            else
                winner = "Computer wins!";
        }

        else
        {
            if(playChoice.equals("R")) //4 checks maximum
                winner = "Player wins!";
            else
                winner = "Computer wins!";
        }

		return winner; //2.5 avg
	}

	public String toString()
	{
        String output = "player had " + playChoice + "\nComputer had " + compChoice;
		return output;
	}
}