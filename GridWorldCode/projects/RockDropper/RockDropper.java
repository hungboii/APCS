import java.awt.Color;
import java.util.ArrayList;
import info.gridworld.actor.*;
import info.gridworld.grid.*;

public class RockDropper extends Critter
{
    public RockDropper(Color color)
    {
        setColor(color);
    }
    public void makeMove(Location loc)
    {
        Location currentLoc = getLocation();

        if (loc == null || loc == currentLoc)
        {
            
        }
        else
        {
            moveTo(loc);
            Rock rock = new Rock(getColor());
            rock.putSelfInGrid(getGrid(), currentLoc);
        }
    }
}
