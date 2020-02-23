import java.awt.Color;
import java.util.ArrayList;
import info.gridworld.actor.*;
import info.gridworld.grid.*;

public class RockEater extends Critter
{
    public ArrayList<Location> getMoveLocations()
    {
        ArrayList<Location> occupiedLocations = getGrid().getOccupiedLocations();
        ArrayList<Location> rocks = new ArrayList<Location>();

        for(Location loc : occupiedLocations)
        {
            if(getGrid().get(loc) instanceof Rock)
                rocks.add(loc);
        }
        return rocks;
    }
}
