public class lab14c
{
    public static void main(String[] args)
    {
        double[] numbers = {10,30,40,70,100};
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

        for(int i = 0; i <  size; i++ )
        {
            for(int j = i+1; j < size; j++)
            { 
                if(numbers[i] > numbers[j])
                {
                    count = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = count;
                }
            }
        }
        return count;
    }
}