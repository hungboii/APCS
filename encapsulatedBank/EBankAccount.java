public class EBankAccount
{
    private double balance;
    private String name;

    public EBankAccount(double b, String n)
    {
        balance = b;
        name = n;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double aBalance)
    {
        balance = aBalance;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String aName)
    {
        name = aName;
    }
    public void deposit(double amount)
    {
        balance = balance + amount;
    }
    public void withdraw(double amount)
    {
        balance = balance - amount;
    }
}