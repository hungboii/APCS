public class quadratic
{
    public static void main(String[] args)
    {
        Double x = Double.parseDouble(args[0]);
        Double y = Double.parseDouble(args[1]);
        Double z = Double.parseDouble(args[2]);

        System.out.print(formula(x, y, z));
    }
    public static Double formula(double a, double b, double c)
    {
        double answer = (-b + (Math.sqrt((b * b) - (4 * a * c)))) / 2 * a;
        return answer;
    } 
}