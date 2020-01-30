import info.gridworld.actor.Bug;

public class DancingBug extends Bug
{
    private int index;
    private int[] numTurns;

    public DancingBug(int[] turns)
    {
        index = 0;
        numTurns = turns;
    }
    public void act()
    {
        if(canMove())
        {
            setDirection(numTurns[index] * 45);
            move();
            index++;
        }
        if(index == numTurns.length)
            index = 0;
    }
}