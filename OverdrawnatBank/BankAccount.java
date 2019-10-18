public class BankAccount
{
    public double balance;
    public String name;

    public BankAccount(double b, String n)
    {
        balance = b;
        name = n;
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