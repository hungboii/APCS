public class FamousMonkeys
{
    public String name;
    public String lastName;
    public String saying;

    public FamousMonkeys(String firstName, String alastName, String asaying)
    {
        name = firstName;
        lastName = alastName;
        saying = asaying;
    }
    public void speak()
    {
        System.out.println(saying + " -" + name + " " + lastName);
    }
}