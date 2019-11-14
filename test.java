public class test
{
    public static void main(String[] args)
    {
        String[] shipNames = {"", "", "Patrol Boat", "Submarine", "Battleship", "Carrier"};

        for(int i = 2; i < 6; i++)
        {
            if(isShipSunk(i))
                System.out.print("[X]");
            else
                System.out.print("[ ]");
            System.out.println(shipNames[i]);
        }
    }
}
