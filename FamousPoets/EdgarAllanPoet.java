public class EdgarAllanPoet extends FamousPoets
{
    public EdgarAllanPoet(String firstName, String alastName, String asaying)
    {
        super(firstName, alastName, asaying);
    }
    public void speak()
    {
        System.out.println("You are a monkey. " + saying + " -" + name + " " + lastName);
    }
}