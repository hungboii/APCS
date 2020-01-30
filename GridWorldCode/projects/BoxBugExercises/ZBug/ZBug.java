import info.gridworld.actor.Bug;

public class ZBug extends Bug
{
    private int steps;
    private int sidelength;
    private int side;

    public ZBug(int length)
    {
        steps = 0; 
        sidelength = length;
        side = 0;
    }
    public void act()
    {
        if(side == 0 || side == 2)
        {
            setDirection(90);
            if(steps < sidelength && canMove())
            {
                move();
                steps++;
            }
        }
        else if(side == 1)
        {
            setDirection(225);
            if(steps < sidelength && canMove())
            {
                move();
                steps++;
            }   
        }
        if(steps == sidelength)
        {
            side++;
            steps = 0;
        }
    }
}