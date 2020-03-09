public class QuickSort
{
    public static void main(String[] args)
    {
        int[] theArray = {4, 2, 5, 1, 3, 18, 0, 9, 6};
        sort(theArray, 0, theArray.length - 1);

        for(int j = 0; j < theArray.length; j++)
            System.out.print(theArray[j] + "  ");
        System.out.println(" ");
    }

    public static void sort(int a[], int left, int right)
    {
        if(left >= right)
            return;
        int k = left;
        int j = right;
        int pivotValue = a[(left + right) / 2];
        while(k < j)
        {
            while(a[k] < pivotValue)
                k++;
            while(pivotValue < a[j])
                j--;
            if(k <= j)
            {
                int temp = a[k];
                a[k] = a[j];
                a[j] = temp;
                k++;
                j--;
            }
        }
        sort(a, left, j);
        sort(a, k, right);
    }
}