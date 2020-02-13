//package info.gridworld.actor;

import info.gridworld.grid.Location;
import info.gridworld.actor.*;
import info.gridworld.grid.*;
import info.gridworld.world.*;

import java.util.ArrayList;
import java.awt.Color;

//my critter has coronavirus but has a very strong immune system so he doesn't die from it. 
//but he still spreads it to others who happen to have weak immune systems and when they get near the infected critter it gives them 3 turns to live. 
//if anyone gets near those that are infected they get infected too.

public class CoronavirusCritter extends Critter
{
    private ArrayList<Integer> turnCounter = new ArrayList<Integer>();
    private ArrayList<Actor> infected = new ArrayList<Actor>();

    public CoronavirusCritter()
    {
        setColor(Color.GREEN);
        for (int i = 0; i < 100; i++) 
            turnCounter.add(3);  
    }
    public ArrayList<Actor> getActorsFirst()
    {
        return getGrid().getNeighbors(getLocation());
    }
    public ArrayList<Actor> getActors()
    {
        int origSize = infected.size();

        for(int i = 0; i < origSize; i++)
        {
            ArrayList<Actor> newInfected = new ArrayList<Actor>();

            try {
                // info.gridworld.grid.Location virus = infected.get(i).getLocation();
                // System.out.println(virus);
                // newInfected = getGrid().getNeighbors(virus);
                newInfected = getGrid().getNeighbors(infected.get(i).getLocation());
            } catch (NullPointerException e) {}

            for(Actor hugh : newInfected)
            {
                if(!(hugh instanceof CoronavirusCritter || infected.contains(hugh)))
                    infected.add(hugh);
            }
        }
        return infected;
        
    }

    public void processActors(ArrayList<Actor> actors)
    {

        for(int i = 0; i < infected.size(); i++)
        {
            infected.get(i).setColor(Color.BLACK);
            turnCounter.set(i, turnCounter.get(i) - 1); //start incubation period of virus
            if(turnCounter.get(i) == 0)
            {
                //CoronavirusRock bruh = new CoronavirusRock();
                //bruh.putSelfInGrid(infected.get(i).getGrid(), infected.get(i).getLocation());
                try {
                    infected.get(i).removeSelfFromGrid();
                } catch (IllegalStateException e) {}

                infected.remove(i);
                turnCounter.remove(i);
                i--;
            }
        }
    }

    public Location selectMoveLocation(ArrayList<Location> locs)
    {
        int n = locs.size();
        if (n == 0)
            return getLocation();
        int r = (int) (Math.random() * n);
        return locs.get(r);    
    }

    public void makeMove(Location loc)
    {
        if (loc == null)
            removeSelfFromGrid();
        else
            moveTo(loc);    
    }

    public void act()
    {
        if(infected == null)
            infected = getActorsFirst();
        else if(infected.isEmpty())
        {
            infected = getActorsFirst();
        }
        super.act();
    }   

}