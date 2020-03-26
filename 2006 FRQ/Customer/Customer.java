public class Customer
{
    private String custName;
    private int custID;
    public Customer(String name, int idNum)
    {
        custName = name;
        custID = idNum;
    }
    public String getName()
    {
        return custName;
    }
    public int getID()
    {
        return custID;
    }
    public int compareCustomer(Customer other)
    {
        if(getName().compareTo(other.getName()) != 0)
            return getName().compareTo(other.getName());
        else
            return getID() - other.getID();
    }
}