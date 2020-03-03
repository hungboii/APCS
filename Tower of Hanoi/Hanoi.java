public class Hanoi
{
    private static int moveCount;
    private static String postOne = "---";
    private static String postTwo = "---";
    private static String postThree = "---";

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
    public static void moveOne(int disk, int fromPost, int toPost) //only works for numbers less than 10 - can only move one digit
    {
        //System.out.println("(Disk " + disk + ") " + fromPost + "--" + toPost);
        if(fromPost == 1)
        {
            if(toPost == 2)
            {
                postTwo = postTwo.replaceFirst("---", disk + "---");

                if(disk > 9) //deal with two digit numbers
                    postOne = postOne.replaceFirst("[0-9]+---", "---");
                else
                    postOne = postOne.replaceFirst("[0-9]---", "---");
            }
            else
            {
                postThree = postThree.replaceFirst("---", disk + "---");

                if(disk > 9)
                    postOne = postOne.replaceFirst("[0-9]+---", "---");
                else
                    postOne = postOne.replaceFirst("[0-9]---", "---");            }
        }
        else if(fromPost == 2)
        {
            if(toPost == 1)
            {
                postOne = postOne.replaceFirst("---", disk + "---");

                if(disk > 9)
                    postTwo = postTwo.replaceFirst("[0-9]+---", disk + "---");
                else
                    postTwo = postTwo.replaceFirst("[0-9]---", "---");                
            }
            else
            {
                postThree = postThree.replaceFirst("---", disk + "---");

                if(disk > 9)
                    postTwo = postTwo.replaceFirst("[0-9]+---", "---"); 
                else
                    postTwo = postTwo.replaceFirst("[0-9]---", "---");
            }
        }

        else //moving from third
        {
            if(toPost == 1)
            {
                postOne = postOne.replaceFirst("---", disk + "---");

                if(disk > 9)
                    postThree = postThree.replaceFirst("[0-9]+---", "---");
                else
                    postThree = postThree.replaceFirst("[0-9]---", "---");
            }
            else //topost == 2
            {
                postTwo = postTwo.replaceFirst("---", disk + "---");

                if(disk > 9)
                    postThree = postThree.replaceFirst("[0-9]+---", "---");
                else
                    postThree = postThree.replaceFirst("[0-9]---", "---");
            }  
        }

        System.out.println(postOne);
        System.out.println(postTwo);
        System.out.println(postThree);

        System.out.println();

    }
    public static int getMoves()
    {
        return moveCount;
    }
    public static String getPostOne(int disks)
    {
        for(int i = 1; i <= disks; i++)
            postOne = i + postOne;
        return postOne;
    }
}