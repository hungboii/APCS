public class Zoe extends FamousMonkeys
{
    private String firstName; //shadowing

    public Zoe(String firstName, String alastName, String asaying)
    {
        super(firstName, alastName, asaying);
        this.firstName = firstName;
    }
}