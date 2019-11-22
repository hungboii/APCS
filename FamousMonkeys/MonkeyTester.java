public class MonkeyTester
{
    public static void main(String[] args)
    {
        FamousMonkeys [] bots = new FamousMonkeys [4];
        bots[0] = new Nick("Nick", "Chan", "cos0cospi/2cos0");
        bots[1] = new Zoe("Zoe", "Moore", "reeee.");
        bots[2] = new Luke("Luke", "Wonzen", "bruh.");
        bots[3] = new Andrew("Andrew", "Cho", "I am monkey.");

        for(FamousMonkeys  monkey : bots)
            monkey.speak();
    }
}