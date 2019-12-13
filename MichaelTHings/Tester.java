import java.util.Scanner;
public class Tester
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        String sen = "", fullSen, eChckSen, sSen[], iSen[];
        int num;
        do
        {
            System.out.print("Type in a sentence and press ENTER: ");
            sen = kb.nextLine();
            fullSen = "";
            eChckSen = sen.toLowerCase();//so i can set the string to lowercase and later print fullSen with uppercase letters
            sen += " ";
            sSen = sen.split("[0-9]+");
            iSen = sen.split("[^0-9]+");
            
            for(int i = 0; i < iSen.length; i++)
            {
                if(!iSen[i].equals(""))
                {
                   num = Integer.parseInt(iSen[i]);
                   num*=2;
                   iSen[i] = num+"";
                }
                fullSen = fullSen + iSen[i]+sSen[i];
            }
            System.out.println(fullSen);
        }while(!eChckSen.equals("exit"));
    }
}