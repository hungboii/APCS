public class RobotTester
{
    public static void main(String[] args)
    {
        SloppyRobot Andrew = new SloppyRobot();
        System.out.println("The robot cleared the hall in " + Andrew.clearHall() + " moves.");
    }
}