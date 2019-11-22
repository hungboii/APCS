public class Nick extends FamousMonkeys
{
    public Nick(String firstName, String alastName, String asaying)
    {
        super(firstName, alastName, asaying);
    }
    public void speak() //override
    {
        System.out.println("bot. " + saying + " -" + name + " " + lastName);
    }
    public void speak(String overload) //overload
    {
        System.out.println(overload + " -" + name + " " + lastName);
    }
}