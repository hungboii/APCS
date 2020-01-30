import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;

public class ZBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        ZBug hugh = new ZBug(4);
        hugh.setColor(Color.GREEN);
        world.add(new Location(2, 2), hugh);
        world.show();
    }
}