public class MergeSort
{
    public static void main(String[] args)
    {
        int[] theArray = {4, 2, 5, 1, 3, 18, 0, 9, 6};
        sort(theArray);

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

    }
}