public class Robot
{
    private int[] hall;
    private int pos;
    private boolean facingRight;

    public Robot(int[] hallway, int position, boolean right)
    {
        hall = hallway;
        pos = position;
        facingRight = right;
    }
    private boolean forwardMoveBlocked()
    {
        if(facingRight)
        {
            if(pos == hall.length - 1)
                return true;
        }
        else if(!facingRight)
        {
            if(pos == 0)
                return true;
        }
        return false;
    }
    private void move()
    {
        if(hall[pos] > 0)
        {
            hall[pos] = hall[pos] - 1;
        }
        if(hall[pos] == 0)
        {
            if(forwardMoveBlocked())
            {
                facingRight = !facingRight;
            }
            else
            {
                if (facingRight)
					pos++;
				else
                    pos--;
            }
        }
    }
    public int clearHall()
    {
        int moves = 0;
        while(!hallIsClear())
        {
            move();
            moves++;
            //System.out.println("pos = " + pos + " trash = " + hall[pos] + " right = " + facingRight);
        }
        return moves;
    }
    private boolean hallIsClear()
    {
        for(int i = 0; i < hall.length; i++)
        {
            if(hall[i] > 0)
                return false;
        }
        return true;
    }
}