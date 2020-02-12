import java.awt.Color;
import java.util.ArrayList;

import javax.tools.DocumentationTool.Location;

import info.gridworld.actor.*;
import info.gridworld.grid.*;
import info.gridworld.world.*;

public class CoronavirusRock extends Rock 
{
    private ArrayList<Integer> turnCounter = new ArrayList<Integer>();
    private ArrayList<Actor> infected = new ArrayList<Actor>();

    public CoronavirusRock()
    {
        setColor(Color.GREEN);
        for (int i = 0; i < 100; i++) 
            turnCounter.add(3);  
    }
    public void getActorsFirst()
    {
        infected = getGrid().getNeighbors(getLocation()); //need to figure out how to get actors near other infected actors. prob get location of infected and add those occupied adjacent locations and add them to the list?
    }
    public void getActors()
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
            } catch (NullPointerException e) {
                
            }

            for(Actor hugh : newInfected)
            {
                if(!(hugh instanceof CoronavirusRock || infected.contains(hugh)))
                    infected.add(hugh);
            }
        }
    }

    public void infectActors()
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
            getActorsFirst();
        else if(infected.isEmpty())
        {
            getActorsFirst();
        }
        else
        {
            getActors();
            infectActors();
        }
    }   

}