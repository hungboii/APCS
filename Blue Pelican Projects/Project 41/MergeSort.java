public class MergeSort
{
    public static void main(String[] args)
    {
        int[] theArray = {4, 2, 5, 1, 3, 18, 0, 9, 6};
        sort(theArray, 0, theArray.length - 1);

        for(int j = 0; j < theArray.length; j++)
            System.out.print(theArray[j] + "  ");
        System.out.println(" ");
    }

    public static void sort(int[] a, int left, int right)
    {
        if(right == left)
            return;
        int middle = (right + left) / 2;
        sort(a, left, middle);
        sort(a, middle + 1, right);
        merge(a, left, middle, right);
    }

    public static void merge(int[] a, int left, int middle, int right)
    {
        int[] tmpArray = new int[right - left + 1];

        int index1 = left;
        int index2 = middle + 1;
        int index = 0;

        while(index1 <= middle && index2 <= right)
        {
            if(a[index1] < a[index2])
            {
                tmpArray[index] = a[index1];
                index1++;
            }
            else
            {
                tmpArray[index] = a[index2];
                index2++;
            }
            index++;
        }
        while(index1 <= middle)
        {
            tmpArray[index] = a[index1];
            index1++;
            index++;
        }
        while(index2 <= right)
        {
            tmpArray[index]= a[index2];
            index2++;
            index++;
        }
        for(index = 0; index <  tmpArray.length; index++)
            a[left + index]  = tmpArray[index];
    }
}