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
            System.out.print(i);
            j++;
        }

        Hanoi newGame = new Hanoi(disks, posts); //just to pass orig num of disks and the array
    
        System.out.println("---");
        System.out.println("---");
        System.out.println("---");
        System.out.println();

        newGame.move(disks, 1, 2, 3);
        System.out.println("Done in " + newGame.getMoves() + " moves");
    }
}