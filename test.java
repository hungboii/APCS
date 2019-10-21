public class test
{
    public static void main(String[] args)
    {
        int[] nums1 = {1, 2, 4, 6, 7, 9, 13, 14, 17};
        int[] nums2 = {0, 3, 5, 8, 9, 11, 12, 14, 17, 18, 20};

        System.out.println(lowestCommon2(nums1, nums2));
    }
    public static int lowestCommon2(int[] nums1, int[] nums2)
    {
        int i = 0;
        int answer = 0;
        int comparison = 0;
        method2:  
            for(int j = 0; j < nums1.length; j++)
            {
                if(nums1[j] < nums2[i])
                    continue;

                while(nums1[j] >= nums2[i])
                {
                    comparison++;
                    if(nums1[j] == nums2[i])
                    {
                        answer = nums1[j];
                        break method2;
                    }
                    i++;
                }
            }
            return comparison;
    }
}
