import java.util.*; 
import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.util.ArrayList;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.Color;

//Zeus being a Greek God can eat every creature. Because he's a god, he throws "hail" in random cells of 
// the grid
public class Zeus extends Critter
{
    public Zeus()
    {
        setColor(Color.YELLOW);
    }
    public void processActors(ArrayList<Actor> actors)
    {
        for (Actor a : actors)
            a.removeSelfFromGrid();
    }
    
    public void act()
    {
        super.act();
        Generator();
    }
     
    public void Generator()
    {
        int row = (int)(Math.random()*9);
        int column = (int)(Math.random()*9);
        Location loc = new Location(row, column);
        Rock r = new Rock();
        r.putSelfInGrid(getGrid(), loc);
    }
    
}
