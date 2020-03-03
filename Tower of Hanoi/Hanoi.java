public class Hanoi
{
    private static int moveCount;

    public static void move(int disks, int fromPost, int sparePost, int toPost)
    {
        if(disks == 1)
        {
            moveOne(disks, fromPost, toPost);
            moveCount++;
        }
        else
        {
            move(disks - 1, fromPost, toPost, sparePost);
            moveOne(disks, fromPost, toPost);
            move(disks - 1, sparePost, fromPost, toPost);
            moveCount++;
        }
    }
    public static void moveOne(int disk, int fromPost, int toPost)
    {
        System.out.println("(Disk " + disk + ") " + fromPost + "--" + toPost);
    }
    public static int getMoves()
    {
        return moveCount;
    }
}