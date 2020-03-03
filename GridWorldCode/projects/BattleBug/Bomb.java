import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.util.*;
import java.awt.Color;

public class Bomb extends Rock
{
    int timer;
    public Bomb()
    {
        timer = 3;
    }
    
    public void explode()
    {
        ArrayList<Actor> actors = getGrid().getNeighbors(getLocation());
        for (Actor a : actors)
            if (!(a instanceof Bomber || a instanceof Bomb))
                a.removeSelfFromGrid();
        removeSelfFromGrid();
    }
    
    public void act()
    {
        if (timer == 0)
            explode();
        timer--;
    }
}