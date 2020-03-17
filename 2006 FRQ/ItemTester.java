public class ItemTester
{
    public static void main(String[] args)
    {
        Vehicle prius = new Vehicle(20000, 2500, .1);
        System.out.println(prius.purchasePrice());
        prius.changeMarkup(1000);
        System.out.println(prius.purchasePrice());
    }
}