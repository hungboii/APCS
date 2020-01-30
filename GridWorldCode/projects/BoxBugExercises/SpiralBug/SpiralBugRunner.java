import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;

public class SpiralBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        SpiralBug hugh = new SpiralBug(2);
        hugh.setColor(Color.GREEN);
        world.add(new Location(5, 5), hugh);
        world.show();
    }
}