public class lab14c
{
    public static void main(String[] args)
    {
        double[] numbers = {10, 20, 25, 63, 96, 100};
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.println("num " + i + ":: " + numbers[i]);
        }
        System.out.print("biggest = " + bigNumber(numbers.length));
    }
    public static double bigNumber(int size)
    {
        double[] numbers = {10, 30, 25, 63, 96, 100};
        double count = numbers[0];

        for(int i = 1; i < numbers.length; i++)
        {
            if(numbers[i] > count)
            {
                count = numbers[i];
            }
        }
        return count;
    }
}