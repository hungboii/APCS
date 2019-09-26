public class quadraticfun
{
    public static void main(String[] args)
    {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        System.out.print(equation(a, b, c));
    }
    public static double equation(double a, double b, double c)
    {
        double answer = (Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / 2 * a;
        return answer;
    }
}