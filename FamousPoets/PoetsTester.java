public class PoetsTester
{
    public static void main(String[] args)
    {
        FamousPoets[] bots = new FamousPoets[4];
        bots[0] = new EdgarAllanPoet("Edgar", "Poe", "We loved with a love that was more than love.");
        bots[1] = new Frost("Robert", "Frost", "In three words I can sum up everything I've learned about life: it goes on.");
        bots[2] = new Shakespeare("William", "Shakespeare", "To be, or not to be: that is the question.");
        bots[3] = new Silverstein("Shel", "Silverstein", "Never explain what you do. It speaks for itself. You only muddle it by talking about it.");

        for(FamousPoets poet : bots)
            poet.speak();
    }
}