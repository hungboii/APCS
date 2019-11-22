public class Battleship
{
    private static int[][] oceania = new int[9][9]; 
    //static because I kept getting error messages if it was non-static
    private USS desTroyeSivan;
    private USS tofuSub;
    private USS cruiseFGL;
    private USS bestBuddyShip;
    private USS carBurnrier;
    private static int sunkCounter;
    public Battleship() 
    {
        //int[][] oceania = new int[8][8];
        //I'm still pleased w how slick this is with USS and then the ship name :))
        desTroyeSivan = new USS(2); // desTROYEr, or uh the singer of "im so tired.. "
        oceania = desTroyeSivan.obtainGridGrain(); 
        tofuSub = new USS(6); //big ol stinky tofu sub(marine)!
        oceania = tofuSub.obtainGridGrain();
        cruiseFGL = new USS(3); //roll my windows down, and cruiseee(r)
        oceania = cruiseFGL.obtainGridGrain();
        bestBuddyShip = new USS(4); //shoutout to 2nd semester seating chart randomizer :) also battleship
        oceania = bestBuddyShip.obtainGridGrain();
        carBurnrier = new USS(5); //homage to the reference you thought i was making during test 3! also carrier!
        oceania = carBurnrier.obtainGridGrain();
        sunkCounter = 0; //this will increase by one each time they sink a ship
        
    }
    //was debugging
    // private void mattBot()
    // {
        // for (int drewBot=0; drewBot <= 8; drewBot++)
        // {
            // for (int zoBot=0; zoBot <=8; zoBot++)
            // {
                // System.out.print("|" + oceania[drewBot][zoBot] + "|");
            // }
            // System.out.println(" ");
        // }
    // }
    
    public static int[][] getOceania()
    {
        return oceania;  //getter
    }
    
    public static int getSunkCounter()
    {
        return sunkCounter;
    }
    
    public static void setCounter()
    {
        sunkCounter++;
    }
    // private int[][] obtainOceania()
    // {
        // oceania = desTroyeSivan.oceania + subSandwich.oceania + cruiseFGL.oceania + bestBuddyShip.oceania + carBurnrier.oceania;
    // }
    
    public int[] checkGuess(int callUm, int rowNie)
    {
        int[] ansWers = new int[2];
        // answers[0] will return info on where the shot went
        if (oceania[rowNie][callUm] == 0)
        {
            ansWers[0] = 0; //miss!
        }
        else if (oceania[rowNie][callUm] > 0)
        {
            ansWers[0] = 1; //hit!!
        }
        else if (oceania[rowNie][callUm] == -1)
        {
            ansWers[0] = 2; //dumbo forgot to guess it again
        }
        else if (oceania[rowNie][callUm] == -2)
        {
            ansWers[0] = 3; //forgot they already missed here
        }
        //answers[1] will return info on the status of the health
        return ansWers;
    }
    
    public void shotMakesContact(int call, int roo)
    {
        oceania[roo][call] = -1;
    }
    
    public void shotHitAManateeSad(int crikey, int roger)
    {
        oceania[roger][crikey] = -2;
    }
    
    public void whichShip(int colemanTires, int rogueOne)
    {
        //at first i was going to return the health and the name of each ship, but it was more logical to print from this method
        int sh = oceania[rogueOne][colemanTires];
        //put this int here so I wouldn't have to type oceania[rogueOne][colemanTires] for each if statement
        //System.out.println("ip " + sh); //was for debugging
        
        if (sh == 2)
        {    
            // return "USS desTroyeSivan";
            desTroyeSivan.shotTaken(); //doesn't return anything, just decreases health
            //desTroyeSivan.healthReport(); // moved to println
            System.out.println("USS desTroyeSivan of length 2 was hit, and now has health " + desTroyeSivan.healthReport());;
            // desTroyeSivan.counter++; didn't use this idea
        }
        else if (sh == 6)
        {    
            //return "USS tofuSub"; otherwise won't get to methods
            tofuSub.shotTaken(); //setHealth
            //tofuSub.healthReport()  moved to println
            System.out.println("USS tofuSub of length 6 was hit, and now has health " + tofuSub.healthReport());
            
            // tofuSub.counter++;
        }
        else if (sh == 3)
        {    
            //return "USS cruiseFGL"; 
            cruiseFGL.shotTaken(); //setHealth
            //cruiseFGL.healthReport(); moved to println
            System.out.println("USS cruiseFGL of length 3 was hit, and now has health " + cruiseFGL.healthReport());
            // cruiseFGL.counter++;
        }
        else if (sh == 4)
        {    
            //return "USS bestBuddyShip"; 
            bestBuddyShip.shotTaken(); //setHealth
            //bestBuddyShip.healthReport(); moved to println
            System.out.println("USS bestBuddyShip of length 4 was hit, and now has health " + bestBuddyShip.healthReport());;
            // bestBuddyShip.counter++;
        }
        else if (sh == 5)
        {    
            //return "USS carBurnrier";
            carBurnrier.shotTaken();
            //carBurnrier.healthReport(); moved to println
            System.out.println("USS carBurnrier of length 5 was hit, and now has health " + carBurnrier.healthReport());
            // carBurnrier.counter++;
        }
        // else
        //return "monkeyReturn"; // no more return value cuz printed here instead
        //this comment is outdated :: //should never get to this statement because the above statements account for each length of ship
    }
    // public int shipHealthAssessment()
    // {
        // return 10;
    // }
    
    //put the health method in USS instead so that each ship has an unique health, so shipHealthAssessment() is obsolete
    public boolean isShipAfloat(int cold, int rudy)
    {
        //run through full column and row and see if it has any of the same number mb,
        for (int coldStone = 0; coldStone <= 8; coldStone++)
        {
            if (oceania[rudy][coldStone] == oceania[rudy][cold])
            {    
                if (coldStone == cold) //obviously the one hit will be the same value as itself. this wouldn't mean the ship's afloat
                {
                    continue;
                }
                return false;
            }
        }
        for (int rude = 0; rude <= 8; rude++)
        {
            if (oceania[rude][cold] == oceania[rudy][cold])
            {   
                if (rude == rudy)
                {
                    continue; //same as above, skips over the sent over value, as it checks the whole row
                }
                return false;
            }
        }
        return true;
    }
}