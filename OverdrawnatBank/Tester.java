import java.util.Scanner;
public class Tester
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("What is your account balance? ");
        double balance = kb.nextDouble();
        System.out.print("What is your name? ");
        kb.nextLine();
        String name = kb.nextLine();

        BankAccount myAccount = new BankAccount(balance, name);
        myAccount.deposit(505.22);
        myAccount.withdraw(100);
        System.out.print("The " + myAccount.name + " account balance is, $" + myAccount.balance);
    }
}