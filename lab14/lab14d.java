public class lab14d
{
    public static void main(String [] args)
    {
        double[] grades = {50, 100, 80};
        for(int i = 0; i < grades.length; i++)
        {
            System.out.println("grade " + i + " :: " + grades[i]);
        }
        System.out.println();
        System.out.print("average :: " + findAverage(grades.length, grades));
    }
    public static double findAverage(int size, double[] grades)
    {
        double sum = 0;
        double answer = 0;

        for(int i = 0; i < size; i++)
        {
            sum = sum + grades[i];
        }
        answer = sum / size;

        return answer;
    }
}