import java.util.Scanner;
public class bruh
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        while(true)
        {
            System.out.print("Rock-Paper-Scissors - Pick your weapon [R, P, S]: ");
            String playerChoice = kb.next();

            if(!(playerChoice.equals("R")||playerChoice.equals("P")||playerChoice.equals("S")))
            {
                System.out.println("please do not break my program.");
                continue;
            }

            RockPaperScissors newGame  = new RockPaperScissors(playerChoice);
            System.out.println(newGame);
            System.out.println(newGame.determineWinner2());
            System.out.println("");
            System.out.print("Do you want to play again? ");

            if(kb.next().equals("n"))
                break;
            System.out.println("");
        }

    }
}