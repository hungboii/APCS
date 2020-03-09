public class BubbleSort
{
    public static void main(String[] args)
    {
        int[] theArray = {4, 2, 5, 1, 3, 18, 0, 9, 6};
        sort(theArray);

        for(int j = 0; j < theArray.length; j++)
            System.out.print(theArray[j]  +"  ");
        System.out.println(" ");
    }
    public static void sort(int a[])
    {
        boolean loopSomeMore;
        do
        {
            loopSomeMore = false;
            for(int j = 0; j < a.length - 1; j++)
            {
                if(a[j] > a[j + 1])
                {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                    loopSomeMore = true;
                }
            }
        }
        while(loopSomeMore);
    }
}