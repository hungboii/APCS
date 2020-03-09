public class Hanoi
{
    private int moveCount;
    private int numDisks;
    private String[][] posts;

    public Hanoi(int disks, String[][] poles)
    {
        numDisks = disks;
        posts = poles;
    }
    
    public void move(int disks, int fromPost, int sparePost, int toPost)
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
    public void moveOne(int disk, int fromPost, int toPost)
    {
        posts[numDisks - disk][fromPost - 1] = ""; //removes disk from orig post, replace w/ empty string
        posts[numDisks - disk][toPost - 1] = disk + ""; //put on new post

        for(int i = 0; i < posts[1].length; i++) //print the posts
        {
            for(int k = 0; k < posts.length; k++)
            {
                if(posts[k][i] == null) //when create array everything is null, so don't print those
                    continue;
                System.out.print(posts[k][i]);
            }
            System.out.println("---");
        }
        System.out.println();

    }
    public int getMoves()
    {
        return moveCount;
    }
}