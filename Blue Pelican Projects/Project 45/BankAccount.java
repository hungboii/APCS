public class BankAccount implements Comparable
{
    public String name;
    public double balance;
    
    public BankAccount(String nm, double amt)
    {
        name = nm;
        balance = amt;
    }
    public void deposit(double dp)
    {
        balance = balance + dp;
    }
    public void withdraw(double wd)
    {
        balance = balance - wd;
    }
    public int compareTo(Object anotherObj)
    {
        BankAccount otherAccount = (BankAccount) anotherObj;

        if(balance < otherAccount.balance)
            return -1;
        else
        {
            if(balance > otherAccount.balance)
                return 1;
            else
                return 0;    
        }
    }
}