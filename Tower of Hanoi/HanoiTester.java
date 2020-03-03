import java.util.Scanner;

public class HanoiTester
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("How many disks? ");
        int disks = kb.nextInt();
    
        System.out.println(Hanoi.getPostOne(disks)); //print initial disk positions
        System.out.println("---");
        System.out.println("---");

        System.out.println();

        Hanoi.move(disks, 1, 2, 3);
        System.out.println("Done in " + Hanoi.getMoves() + " moves");
    }
}