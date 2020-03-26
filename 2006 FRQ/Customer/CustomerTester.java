public class CustomerTester
{
    public static void main(String[] args)
    {
        Customer[] result = new Customer[6];
        Customer[] list1 = {new Customer("Arthur", 4920),
                new Customer("Burton", 3911),
                new Customer("Burton", 4944),
                new Customer("Franz", 1692),
                new Customer("Horton", 9221),
                new Customer("Jones", 5554),
                new Customer("Miller", 9360),
                new Customer("Nguyen", 4339) };
        Customer[] list2 = {new Customer("Aaron", 1729),
                new Customer("Baker", 2921),
                new Customer("Burton", 3911),
                new Customer("Dillard", 6552),
                new Customer("Jones", 5554),
                new Customer("Miller", 9360),
                new Customer("Noble", 3335) };
        
        prefixMerge(list1, list2, result);
        for(Customer joe : result)
            System.out.println(joe.getName() + ", " + joe.getID());

    }
    public static void prefixMerge(Customer[] list1, Customer[] list2, Customer[] result)
    {
        int indexOne = 0;
        int indexTwo = 0;

        for(int i  = 0; i < result.length; i++)
        {
            if(list1[indexOne].compareCustomer(list2[indexTwo]) < 0)
            {
                result[i] = list1[indexOne];
                indexOne++;
            }
            else if(list1[indexOne].compareCustomer(list2[indexTwo]) > 0)
            {
                result[i] = list2[indexTwo];
                indexTwo++;
            }
            else
            {
                result[i] = list1[indexOne];
                indexOne++;
                indexTwo++;
            }
        }
    }
}