package info.gridworld.actor;

import java.awt.Color;

public class Coronavirus extends Rock 
{
    private static final Color DEFAULT_COLOR = Color.BLACK;

    public Coronavirus()
    {
        setColor(DEFAULT_COLOR);
    }

    public Coronavirus(Color rockColor)
    {
        setColor(rockColor);
    }

    public void act()
    {
        ArrayList<Location> neighbors = getOccupiedAdjacentLocations(getLocation());
        for(Location joe : neighbors)
        {
            if(get(joe) != null)
                get(joe).infect(joe);
        }
    }

    public void infect(Location infected)
    {
        int turns = 0;
        
        get(infected).removeSelfFromGrid();

    }

}