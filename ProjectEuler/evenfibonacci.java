public class evenfibonacci
{
    public static void main(String[] args)
    {
        int sum = 0;
        int x = 0;
        int y = 1;
        int z = 0;
        while(z < 4000000)
        {
            z = x + y;
            x = y;
            y = z;

            if(z % 2 == 0)
            {
                sum += z;
            }
        }
        System.out.print(sum); 
    }
}