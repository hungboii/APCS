public class test
{
    public static void main(String[] args)
    {
        for(int i = 0; i < args.length; i++)
        {
            double x = Double.parseDouble(args[i]);
            System.out.println("num " + i + ":: " + x);
        }
    }
}