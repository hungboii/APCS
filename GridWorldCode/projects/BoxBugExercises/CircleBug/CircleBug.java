import info.gridworld.actor.Bug;

public class CircleBug extends Bug
{
    private int steps;
    private int sidelength;

    public CircleBug(int length)
    {
        steps = 0; 
        sidelength = length;
    }
    public void act()
    {
        if(steps < sidelength && canMove())
        {
            move();
            steps++;
        }
        else
        {
            turn();
            steps = 0;    
        }
    }
}