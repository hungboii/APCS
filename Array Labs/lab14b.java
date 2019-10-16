public class lab14b
{
    public static void main(String[] args)
    {
        int[] numbers = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1, -2};
        System.out.println("is going Up ? " + goingUp(numbers));
        System.out.println("is going Down ? " + goingDown(numbers));
    }
    public static boolean goingUp(int[] numbers)
    {
        for(int i = 1; i < numbers.length; i++)
        {
            if(numbers[i] < numbers[i - 1])
            return false;
        }
        return true;
    }
    public static boolean goingDown(int[] numbers)
    {
        for(int i = 1; i < numbers.length; i++)
        {
            if(numbers[i] > numbers[i - 1])
            return false;
        }
        return true;
    }
}