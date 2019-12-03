public class SloppyRobot extends Robot
{
    private int moveCount;

    public SloppyRobot()
    {
        moveCount = 0;
    }
    public void move()
    {
        if (moveCount > 0 && moveCount % 3 == 0)
        {
            getHall()[getPosition()] = getHall()[getPosition()] + 1;
            //System.out.println("oops");
        }
        if(getHall()[(getPosition())] > 0)
        {
            getHall()[(getPosition())] = getHall()[(getPosition())] - 1;
            moveCount++;
        }
        if(getHall()[(getPosition())] == 0)
        {
            if(forwardMoveBlocked())
            {
                setDirection(!getDirection());
            }
            else
            {
                if (getDirection())
		            setPosition(getPosition() + 1);
		        else
                    setPosition(getPosition() - 1);
                moveCount++;
            }
        }
    }
}