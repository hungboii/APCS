public class sumsquare
{
    public static void main(String[] args)
    {
        int count = 1;
        double y = 0;
        double sum = 0;
        double sum2 = 0;
        while(count <= 100)
        {
            if(count < 100)
            {
                sum2 = sum2 + count;
            }
            else
            {
                sum2 = sum2 + count;
                sum2 = Math.pow(sum2, 2);
            }
            y = Math.pow(count, 2);
            sum = sum + y;
            count++;
        }
        double difference = sum2 - sum;
        System.out.print(difference);
    }
}