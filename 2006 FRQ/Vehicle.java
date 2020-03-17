public class Vehicle extends TaxableItem
{
    private double dealerCost;
    private double dealerMarkup;

    public Vehicle(double dCost, double dMark, double tax)
    {
        super(tax);
        dealerCost = dCost;
        dealerMarkup = dMark;
    }
    public double getListPrice()
    {
        return dealerCost + dealerMarkup;
    }
    public void changeMarkup(double newMarkup)
    {
        dealerMarkup = newMarkup;
    }

}