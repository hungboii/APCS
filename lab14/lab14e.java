public class lab14e
{
    public static void main(String[] args)
    {
        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 2, 0, 2, 3, 5, 6, 8, 8, 8, 9, 4, 5};
        int count = 0; 

        for(int i = 0; i <= 9; i++)
        {
            for(int j = 0; j < numbers.length; j++)
            {
                if(i == numbers[j])
                {
                    count = count + 1;
                }
            }
            System.out.println(i + " - " + count);
            count = 0;
        }
    }
}
