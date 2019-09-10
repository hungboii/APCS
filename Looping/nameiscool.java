public class nameiscool
{
    public static void main(String[] args)
    {
        int x = 0;
        while(x<=30000)
        {
            try
            {
                Thread.sleep(200);
            }
            catch(InterruptedException e){}

            System.out.print("Matthew is cool!                                      ");
            x++;
        }
    }
}