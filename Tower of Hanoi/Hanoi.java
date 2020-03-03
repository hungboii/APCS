public class Hanoi
{
    private int moveCount;
    private int origDisk;
    public int move(int disks)
    {
        if(moveCount == Math.pow(2, origDisk - 1)) //min number of moves
            return 0;

        else if(disks == 1)
        {
            move();
            moveCount++;
        }
        else if(disks != 1)
        {
            move(1);
            moveCount++;
        }

    }
}