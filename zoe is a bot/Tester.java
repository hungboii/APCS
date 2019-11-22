import java.util.Scanner;
public class Tester
{
    public static void main(String[] args) throws InterruptedException
    {
        Battleship newGame = new Battleship();
        int[][] oceaniaTester = new int[9][9];
        System.out.println("DIS BRUH IS OCEANIA ");
        oceaniaTester = newGame.getOceania();
        for (int drewBot=0; drewBot <= 8; drewBot++)
        {
            for (int zoBot=0; zoBot <=8; zoBot++)
            {
                System.out.print("|" + oceaniaTester[drewBot][zoBot] + "|");
            }
            System.out.println(" ");
        }

        // USS desTroyeSivan = new USS(2);
        // USS subSandwich = new USS(3);
        // USS cruiseFGL = new USS(3);
        // USS bestBuddyShip = new USS(4);
        // USS carBurnrier = new USS(5);

        System.out.println("welcome to zattleship");
        Thread.sleep(1000);
        System.out.println("go ahead and pop some corn, i'm placing your ships");
        Thread.sleep(1000);
        System.out.println("ships are heavy hold on");
        Thread.sleep(1000);
        System.out.println("working on it mr joo");
        Thread.sleep(1000);
        System.out.println("the plants are taking shelter!");
        Thread.sleep(1000);
        System.out.println("clearing civilian ships for battle");
        Thread.sleep(1000);
        System.out.println("warning the sealife that projectiles are coming");
        Thread.sleep(2000);
        System.out.println("alright. time to guess");
        Thread.sleep(2000);
        //that is comedy gold mr joo. you said to add comments :)))

        System.out.println("OceaniaBreh below!!!!!!");
        // int[][] oceaniaTester = new int[8][8];
        // oceaniaTester = Battleship.getOceania();
        for (int svidrigailov = 0; svidrigailov <= 8; svidrigailov++)
        {
            for (int porfiryPetrovich = 0; porfiryPetrovich <= 8; porfiryPetrovich++)
            {
                System.out.print("|" + oceaniaTester[svidrigailov][porfiryPetrovich] + "|");
            }
            System.out.println(" ");
        }
        do
        {
            Scanner helloPlayer = new Scanner(System.in);
            System.out.println("row number? PS: you are a computer. guess 0-8");
            int rowEnisch = helloPlayer.nextInt();
            String monKeyVariAble = helloPlayer.nextLine();
            System.out.println("colm number? PS: you are a computer. guess 0-8");
            int colUm = helloPlayer.nextInt();
            int[] guessResults = new int[3];
            guessResults = newGame.checkGuess(colUm, rowEnisch);
            //  boolean guess= newGame.checkGuess(colUm, rowEnisch); added array as a return so that I could say "haha" if they guess the same spot again
            // and also so that i can say if they sunk the ship or nah 
            if (guessResults[0] == 0) //this is for a miss
            {
                System.out.println("too bad so sad. this is a miss. try again !! (or, you tried! but you failed. as mr joo would say)");
                newGame.shotHitAManateeSad(colUm, rowEnisch); //changes grid to let oceania know they missed here
            }
            else if (guessResults[0] == 1) //congrats they hit a ship!
            {
                System.out.println("good work. it's a hit! (hit or miss, i guess they never miss, huh?");
                // newGame.shotMakesContact(colUm, rowEnisch); //changes it in grid to let oceania know they hit here
                //had to move this to the bottom so that whichShip would worl
                newGame.whichShip(colUm, rowEnisch);
                //System.out.println(newGame.whichShip(colUm, rowEnisch) + " was hit!"); //gathers which ship was hit to tell the player
                //didn't use above println, instead printed it in the method whichShip
                //moved shotTaken to be called in the whichShip method
                // int footer = oceaniaTester[rowEnisch][colUm];
                // if (footer == 2)
                // {
                // desTroyeSivan.shotTaken(); 
                // }
                
                if (newGame.isShipAfloat(colUm, rowEnisch))
                {
                    System.out.println("congrats, you sunk it!");
                    newGame.setCounter();
                    int ex = 5-newGame.getSunkCounter();
                    System.out.println(ex + " left..");
                    if (newGame.getSunkCounter() == 5)
                    {
                        System.out.println("you've sunk all ships! you've just won battleship..");
                    }
                }  
                newGame.shotMakesContact(colUm, rowEnisch); 
                //moved it after for whichShip to work, and it changes the value to -1 to signify that it was hit at that spot
            }
            else if (guessResults[0] == 2) //tells them they hit a ship here already smh
            {
                System.out.println("you are a bot. you already hit a ship here!");
            }
            else if (guessResults[0] == 3) //tells them they already missed here
            {
                System.out.println("you are a mega bot. you already hit one manatee here at this same spot. you really had to go back to hit timmy the manatee too??"); //they'd already fired here
            }
            //  newGame.shotMakesContact(colUm, rowEnisch); makes sense to put it when theres a hit
            for (int drewBot=0; drewBot <= 8; drewBot++)
            {
                for (int zoBot=0; zoBot <=8; zoBot++)
                {
                    System.out.print("|" + oceaniaTester[drewBot][zoBot] + "|");
                }
                System.out.println(" ");
            }

        }
        while (!(newGame.getSunkCounter()==5));
    }
}