import java.io.*;
import java.util.*; //includes ArrayList
import java.text.*; //for NumberFormat
public class BigBucksTester
{
    public static void main(String args[])
    {
        NumberFormat formatter = NumberFormat.getNumberInstance( );
        formatter.setMinimumFractionDigits(2);
        formatter.setMaximumFractionDigits(2);
        String name;
        ArrayList<BankAccount> aryList = new ArrayList<BankAccount>();

        do
        {
            Scanner kbReader = new Scanner(System.in);
            System.out.print("Please enter the name to whom the account belongs.(\"Exit\" to abort) ");
            name = kbReader.nextLine( );

            if( !name.equalsIgnoreCase("EXIT") )
            {
                System.out.print("Please enter the amount of the deposit. ");
                double amount = kbReader.nextDouble();
                System.out.println(" "); 
                BankAccount bruh = new BankAccount(name, amount);
                aryList.add(bruh);
            }

        }while(!name.equalsIgnoreCase("EXIT"));

        BankAccount ba = aryList.get(0);
        double maxBalance = ba.balance;
        String maxName = ba.name;

        for(int j = 1; j < aryList.size( ); j++)
        {
            BankAccount big = aryList.get(j);
            if(big.balance > maxBalance)
            {
                maxBalance = big.balance;   
                maxName = big.name;
            }     
        }
        System.out.println("The account with the largest balance belongs to " + maxName + ".");
        System.out.println("The amount is " + maxBalance + ".");
    }
}