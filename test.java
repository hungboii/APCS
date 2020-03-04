import java.util.ArrayList;

public class test
{
    public static void main(String[] args)
    {
        

    }
    public static void moveOne(int disk, int fromPost, int toPost)
    {        
        String[][] posts = new String[numDisks][3];
        int j = 0;
        for(int i = numDisks; i > 0; i--) //fill first post with original disks 
        {
            posts[j][0] = i;
            j++;
        }
        
        posts[fromPost - 1][numDisks - disk] = ""; //removes disk from orig post
        posts[toPost - 1][numDisks - disk] = disk;//put on new post

        for(int i = 0; i < posts.length; i++)
        {
            for(int k = 0; k < posts[1].length; k++)
                System.out.print(posts[i][k]);
            System.out.println("---");
        }
    }
}