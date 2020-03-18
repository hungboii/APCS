import java.io.*;
import java.util.*;
import java.text.*;
public class BankTester
{
    public static void main(String args[])
    {
        NumberFormat formatter = NumberFormat.getNumberInstance( );
        formatter.setMinimumFractionDigits(2);
        formatter.setMaximumFractionDigits(2);
        String name;
        int j;

        BankAccount[] ba = new BankAccount[5];

        for(j = 0; j < ba.length; j++)
        {
            Scanner kbReader = new Scanner(System.in);
            System.out.print("Please enter the name to whom the account belongs. ");
            name = kbReader.nextLine( );

            System.out.print("Please enter the amount of the deposit. ");
            double amount = kbReader.nextDouble();
            System.out.println(" "); 
            BankAccount bruh = new BankAccount(name, amount);
            ba[j] = bruh;
        }

        Arrays.sort(ba);
        for(BankAccount account : ba)
            System.out.println(account.name + " <<< " + account.balance);
            
    }
}