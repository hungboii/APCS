import java.util.ArrayList;

public class test
{
    public static void main(String[] args)
    {
        

    }
    public static void moveOne(int disk, int fromPost, int toPost)
    {
        // ArrayList<Integer> postTwo = new ArrayList<Integer>();
        // ArrayList<Integer> postThree = new ArrayList<Integer>();

        // for(int i = 12; i > 0; i--)
        //     postOne.add(i);

        // if(fromPost == 1)
        //     postOne.remove(postOne.size() - 1);
        //     postTwo.add(disk);
        
        
        String[][] posts = new String[numDisks][2];

        for(int i = numDisks; i > 0; i--) //fill first post with original disks 
            posts[i][0] = i;
        
        posts[i][disk + 1]
    }
}