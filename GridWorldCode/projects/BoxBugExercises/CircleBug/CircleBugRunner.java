import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;

public class CircleBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        CircleBug joe = new CircleBug(4);
        joe.setColor(Color.BLUE);
        world.add(new Location(1, 3), joe);
        world.show();
    }
}