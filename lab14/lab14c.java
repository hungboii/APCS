public class lab14c
{
    public static void main(String[] args)
    {
        double[] numbers = {154, 2451, 541, 5854, 0};
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.println("num " + i + ":: " + numbers[i]);
        }
        System.out.print("biggest = " + bigNumber(numbers.length));
    }
    public static double bigNumber(int size)
    {
        double[] numbers = {154, 2451, 541, 5854, 0};
        double count = 0;
        for(int i = 1; i < size; i++)
        {
            if(numbers[i] > numbers[i - 1])
            {
                count = numbers[i - 1];
            }
        }
        return count;
    }
}