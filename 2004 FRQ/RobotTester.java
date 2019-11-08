public class RobotTester
{
    public static void main(String[] args)
    {
        int[] hall = {1, 1, 2, 2};
        
        Robot Andrew = new Robot(hall, 1, true);
        System.out.println("The robot cleared the hall in " + Andrew.clearHall() + " moves.");
    }
}