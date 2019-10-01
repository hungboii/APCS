public class quadraticfun
{
    public static void main(String[] args)
    {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        System.out.print(equation(a, b, c));
    }
    public static double equation(double a2, double b2, double c2)
    {
        double answer = (-b2 + (Math.sqrt((b2 * b2) - (4 * a2 * c2)))) / 2 * a2;
        return answer;
    }
}