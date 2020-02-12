package info.gridworld.actor;

import info.gridworld.grid.Location;

import java.util.ArrayList;

public class VirusCritter extends Critter 
{
    private ArrayList<Integer> turnCounter = new ArrayList<Integer>();
    private ArrayList<Actor> infected = new ArrayList<Actor>();

    public VirusCritter()
    {
        setColor(Color.GREEN);
        for (int i = 0; i < 100; i++) 
            turnCounter.add(3);  
    }
    public ArrayList<Actor> getActorsFirst()
    {
        return getGrid().getNeighbors(getLocation()); //rocks don't die to virus? only carry it? or make a critter that moves
    }
    public ArrayList<Actor> getActors()
    {
        ArrayList<Actor> virus = infected;
        int origSize = virus.size();

        for(int i = 0; i < origSize; i++)
        {
            ArrayList<Actor> newInfected = new ArrayList<Actor>();

            try {
                // info.gridworld.grid.Location virus = infected.get(i).getLocation();
                // System.out.println(virus);
                // newInfected = getGrid().getNeighbors(virus);
                newInfected = getGrid().getNeighbors(virus.get(i).getLocation());
            } catch (NullPointerException e) {}

            for(Actor hugh : newInfected)
            {
                if(!(hugh instanceof CoronavirusRock || virus.contains(hugh)))
                    virus.add(hugh);
            }
        }
        return virus;
        
    }

    public void processActors(ArrayList<Actor> infected)
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
    public void act()
    {
        if(infected == null)
            infected = getActorsFirst();
        else if(infected.isEmpty())
        {
            infected = getActorsFirst();
        }
        else
        {
            getActors();
            processActors(infected);
            ArrayList<Location> moveLocs = getMoveLocations();
            Location loc = selectMoveLocation(moveLocs);
            makeMove(loc);
        }
    }   

}