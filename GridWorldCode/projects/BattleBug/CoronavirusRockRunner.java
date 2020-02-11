import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

import java.awt.Color;

public class CoronavirusRockRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        world.add(new Location(7, 8), new Bug());
        world.add(new Location(3, 3), new Bug());
        world.add(new Location(2, 8), new Bug());
        world.add(new Location(5, 5), new Rock(Color.PINK));
        world.add(new Location(1, 5), new Bug());
        world.add(new Location(7, 2), new Bug(Color.YELLOW));
        world.add(new Location(4, 4), new CoronavirusRock());
        world.show();
    }
}