import java.util.Scanner;

public class HanoiTester
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("How many disks? ");
        int disks = kb.nextInt();
        Hanoi.move(disks, 1, 2, 3);

        System.out.println("Done in " + Hanoi.getMoves() + " moves");
    }
}