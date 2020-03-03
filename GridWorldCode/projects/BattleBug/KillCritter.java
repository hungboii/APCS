import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Critter;
import info.gridworld.actor.*;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import java.util.ArrayList;
import java.awt.Color;

public class KillCritter extends Critter
{   
    private ArrayList<Location> AdjacentLocs;
    private ArrayList<Actor> adjacentActors;


    public void act() // Acts like a typical critter, but kills everything immediately adjacent to it
    {
        AdjacentLocs = getGrid().getOccupiedAdjacentLocations(getLocation());
        adjacentActors = getGrid().getNeighbors(getLocation());

        super.act();
        if(getGrid().getOccupiedAdjacentLocations(getLocation()).size() > 0)
        for(int j = 0; j<AdjacentLocs.size(); j++)
        {
            try {
            adjacentActors.get(j).removeSelfFromGrid();
            } catch (IllegalStateException e) {}

            adjacentActors.remove(j);
            AdjacentLocs.remove(j);
            j--;
        }
    }
}