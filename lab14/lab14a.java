public class lab14a
{
    public static void main(String[] args)
    {
        System.out.println("sum of spots 3-6 = " + addNumbers(3,6));
        System.out.println("sum of spots 2-9 = " + addNumbers(2,9));
        System.out.println("# of 0s = " + counter(0));
        System.out.print("# of 4s = " + counter(4));
    }
    public static int addNumbers(int start, int stop)
    {
        int sum = 0;
        int [] numbers = {4, 10, 0, 1, 7, 6, 5, 3, 2, 9};
        for(int i = start; i < stop; i++)
        {
            sum = sum + numbers[i];
        }
        return sum;
    }
    public static int counter(int howmany)
    {
        int [] numbers = {4, 10, 0, 1, 7, 6, 5, 3, 2, 9};
        int count = 0;
        for(int i = 0; i < numbers.length; i++)
        {
            if(howmany == numbers[i])
            {
                count = count + 1;
            }
        }
        return count;
    }
}