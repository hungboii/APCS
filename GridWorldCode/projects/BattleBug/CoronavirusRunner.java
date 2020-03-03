import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

import java.awt.Color;

public class CoronavirusRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        world.add(new Location((int)(Math.random() * 10), (int)(Math.random() * 10)), new Zeus());
        world.add(new Location((int)(Math.random() * 10), (int)(Math.random() * 10)), new Bomber());
        world.add(new Location((int)(Math.random() * 10), (int)(Math.random() * 10)), new KillCritter());
        world.add(new Location((int)(Math.random() * 10), (int)(Math.random() * 10)), new Bug(Color.RED));
        world.add(new Location((int)(Math.random() * 10), (int)(Math.random() * 10)), new RockMoat());
        world.add(new Location((int)(Math.random() * 10), (int)(Math.random() * 10)), new CoronavirusCritter());
        world.add(new Location((int)(Math.random() * 10), (int)(Math.random() * 10)), new Zeus());
        world.add(new Location((int)(Math.random() * 10), (int)(Math.random() * 10)), new Bomber());
        world.add(new Location((int)(Math.random() * 10), (int)(Math.random() * 10)), new KillCritter());
        world.add(new Location((int)(Math.random() * 10), (int)(Math.random() * 10)), new Bug(Color.RED));
        world.add(new Location((int)(Math.random() * 10), (int)(Math.random() * 10)), new RockMoat());
        world.add(new Location((int)(Math.random() * 10), (int)(Math.random() * 10)), new CoronavirusCritter());
        world.show();
    }
}