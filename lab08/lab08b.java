import java.util.Scanner;
public class lab08b
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("start ");
        int start = kb.nextInt();
        System.out.print(" : stop ");
        int stop = kb.nextInt(); 
        System.out.print(" : increment ");
        int increment = kb.nextInt();

        for(int start1 = start; start <= stop; start = start + increment)
        {
            System.out.print(start + " ");
        }
    }
}