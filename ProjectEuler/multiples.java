public class multiples
{
    public static void main(String[] args)
    {
        int x = 0;
        int y = 0;
        while(x < 1000)
        {
            if(x % 3 == 0)
            {
                y += x;
            } 
            else if(x % 5 == 0) 
            {
                y += x;
            }
            x++;
        }
        System.out.print(y);
            
    }
}