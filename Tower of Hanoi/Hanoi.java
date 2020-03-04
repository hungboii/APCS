public class Hanoi
{
    private static int moveCount;
    private static int numDisks;
    private static String[][] posts;

    public Hanoi(int disks, String[][] poles)
    {
        numDisks = disks;
        posts = poles;
    }
    
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
        posts[numDisks - disk][fromPost - 1] = ""; //removes disk from orig post
        posts[numDisks - disk][toPost - 1] = disk + ""; //put on new post

        for(int i = 0; i < posts[1].length; i++)
        {
            for(int k = 0; k < posts.length; k++)
            {
                if(posts[k][i] == null)
                    continue;
                System.out.print(posts[k][i]);
            }
            System.out.println("---");
        }
        System.out.println();

    }
    public static int getMoves()
    {
        return moveCount;
    }
}