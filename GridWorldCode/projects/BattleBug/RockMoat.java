import java.awt.Color;
import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.util.ArrayList;
// ---places rocks surrounding it
// --- turns everything pink , like the frosting on the cake from senior night
public class RockMoat extends Critter
{

    public RockMoat()
    {
        setColor(Color.GREEN);
    }
    public void makeMove(Location loc)
    {
        if (loc == null)
        { 
            removeSelfFromGrid();
        }
        else 
        {
            // random feet shuffling as it moves
            
            setDirection(45 * (int)(Math.random() * 8));
            
            moveTo(loc);
            
            ArrayList<Location> spawnRockLoc = getGrid().getValidAdjacentLocations(loc);
            for (Location lo : spawnRockLoc)
            {
                Rock newCake = new Rock(Color.PINK);
                newCake.putSelfInGrid(getGrid(), lo);
            }
        }
    }
}