public class ObjectBinary
{
    public static void main(String[] args)
    {
        int i[] = {-7, 15, 21, 22, 43, 49, 51, 67, 78, 81, 84, 89, 95, 97};
        Integer iw[] = new Integer[14];
        for(int k = 0; k < 14; k++)
            iw[k] = i[k];

        System.out.println(binarySearch(iw, 22)); 
        System.out.println(binarySearch(iw, 89));
        System.out.println(binarySearch(iw, -100));
        System.out.println(binarySearch(iw, 72));
        System.out.println(binarySearch(iw, 102)); 
    }
    public static int binarySearch(Object[] a, Object srchVal)
    {
        Comparable searchVal = (Comparable) srchVal;
        int lb = 0;
        int ub = a.length - 1;

        while(lb <= ub)
        {
            int mid = (lb + ub) / 2;
            if(searchVal.compareTo(a[mid]) == 0)
            {
                return mid;
            }
            else if(searchVal.compareTo(a[mid]) > 0)
            {
                lb = mid + 1;
            }
            else
            {
                ub = mid - 1;
            }
        }
        return -1;
    }
}