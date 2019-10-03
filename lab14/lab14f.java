public class lab14f
{
    public static void main(String[] args)
    {
        int position = Integer.parseInt(args[0]);
        int[] fibonacci = new int[2];

        int first = 0;
        int second = 1;
        int newNumber = 0;

        for(int i = 0; i < 2; i++)
        {
            newNumber = first + second;
            first = second;
            second = newNumber;
            fibonacci[i] = first;
        }

        if(position > fibonacci.length)
            System.out.print("-1");

        if(position <= fibonacci.length)
            System.out.print(fibonacci[position - 1]);
    }
}