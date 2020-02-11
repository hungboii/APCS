import java.awt.Color;
import java.util.ArrayList;
import info.gridworld.actor.*;
import info.gridworld.grid.*;
import info.gridworld.world.*;

public class CoronavirusRock extends Rock 
{
    private ArrayList<Integer> turnCounter;
    private ArrayList<Actor> infected;

    public CoronavirusRock()
    {
        setColor(Color.GREEN);
        for (int i = 0; i < 50; i++) 
            turnCounter.add(3);
        
    }

    public CoronavirusRock(Color rockColor)
    {
        setColor(rockColor);
    }

    public void getActors()
    {
        infected = getOccupiedAdjacentLocations(getLocation()); //need to figure out how to get actors near other infected actors. prob get location of infected and add those occupied adjacent locations and add them to the list?
    }

    public void infectActors()
    {
        for(int i = 0; i < infected.size(); i++)
        {
            turnCounter.set(i, turnCounter.get(i) - 1); //start incubation period of virus
            if(turnCounter.get(i) == 0)
            {
                infected.get(i).removeSelfFromGrid();
                infected.remove(i);
                turnCounter.remove(i);
                i--;
            }
        }
    }
    public void act()
    {
        if(infected == null)
			getActors();
        else if(infected.isEmpty())
            getActors();
        else
            infectActors();
    }

}