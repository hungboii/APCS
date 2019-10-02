public class test
{
    public static void main(String[] args)
    {
       int i = 52;
       if((i / 10 + i % 10) % 7 == 0)
        System.out.print("yup");
        for(int i = 0; i < args.length; i++)
        {
            double x = Double.parseDouble(args[i]);
            System.out.println("num " + i + ":: " + x);
        }
        Double a = Double.parseDouble(args[0]);
        Double b = Double.parseDouble(args[1]);
        Double c = Double.parseDouble(args[2]);

        System.out.println("The positive x value is " + littleMethod(a, b, c));
    }

    public static Double littleMethod(Double a, Double b, Double c)
    {
        Double radical = Math.sqrt(Math.pow(b, 2) - (4 * a * c));
        Double twoA = 2 * a;
        
        Double answer = (0 - b + radical) / twoA;
        return answer;
    }
}
