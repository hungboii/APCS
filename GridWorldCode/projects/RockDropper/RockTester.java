import java.awt.Color;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.*;
import info.gridworld.grid.*;

public class RockTester
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        world.setGrid(new BoundedGrid(40, 70));
        world.add(new RockDropper(Color.RED));
        world.add(new RockDropper(Color.GREEN));
        world.add(new RockDropper(Color.YELLOW));
        world.add(new RockEater());
        world.show();
    }
}