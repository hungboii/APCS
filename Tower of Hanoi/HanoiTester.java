import java.util.Scanner;

public class HanoiTester
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("How many disks? ");
        int disks = kb.nextInt();

        String[][] posts = new String[disks][3];
        int j = 0;
        
        for(int i = disks; i > 0; i--) //fill first post with original disks 
        {
            posts[j][0] = i + "";
            j++;
        }

        Hanoi joe = new Hanoi(disks, posts); //just to pass orig num of disks and the array
    
        Hanoi.move(disks, 1, 2, 3);
        System.out.println("Done in " + Hanoi.getMoves() + " moves");
    }
}