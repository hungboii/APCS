import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.util.*;
import java.awt.Color;

public class Bomber extends Critter
{
    int count;
    public Bomber()
    {
        setColor(Color.RED);
        count = 0;
    }
    
    public void processActors(ArrayList<Actor> actors)
    {
    }
     
    public void makeMove(Location loc)
    {
        Location oldloc = getLocation();
        if (loc == null)
            removeSelfFromGrid();
        else
            moveTo(loc);
       
        if (count % 3 == 0)
        {
            Bomb bomb = new Bomb();
            bomb.setColor(Color.RED);
            bomb.putSelfInGrid(getGrid(), oldloc);
        }
        count++;
    }
}

//bomber likes to bomb things yay