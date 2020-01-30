import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;

public class DancingBugRunner
{
    public static void main(String[] args)
    {
        int[] turns = {3, 5, 1, 2, 6};
        ActorWorld world = new ActorWorld();
        DancingBug hugh = new DancingBug(turns);
        hugh.setColor(Color.GREEN);
        world.add(new Location(2, 2), hugh);
        world.show();
    }
}