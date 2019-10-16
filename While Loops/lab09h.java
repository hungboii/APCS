import java.util.Scanner;
public class lab09h
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number. ");
        int num = kb.nextInt();
        int counter = 1;
        int sum = 0;
        
        while(counter < num)
        {
            if(num % counter == 0)      
            {
                sum = sum + counter; 
            }
            
            if(counter == num - 1)
            {
                if(sum == num)
                {
                    System.out.print(num + " is perfect.");
                    break;
                }   
                else
                {
                    System.out.print(num + " is not perfect.");
                }
            }
            counter++;
        }
    }
}