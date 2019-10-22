public class arrayCrawler
{
    public static void main(String[] args)
    {
        int[] nums1 = {1, 2, 4, 6, 7, 9, 13, 14, 17};
        int[] nums2 = {0, 3, 5, 8, 9, 11, 12, 16, 17, 18, 20};

        System.out.println(lowestCommon1(nums1, nums2));
        System.out.println(lowestCommon2(nums1, nums2));
    }
    public static int lowestCommon1(int[] nums1, int[] nums2)
    {
        int answer = 0;
        
        method1: 
            for(int i = 0; i < nums1.length; i++)
            {
                for(int j = 0; j < nums2.length; j++)
                {
                    if(nums1[i] == nums2[j])
                    {
                        answer = nums1[i];
                        break method1;
                    }
                }
            }
        if(answer == 0)
        {    
            return 69420360;
        }
        return answer;
    }
    public static int lowestCommon2(int[] nums1, int[] nums2)
    {
        int i = 0;
        int answer = 0;

        method2:  
            for(int j = 0; j < nums1.length; j++)
            {
                if(nums1[j] < nums2[i])
                    continue;

                while(nums1[j] >= nums2[i])
                {
                    if(nums1[j] == nums2[i])
                    {
                        answer = nums1[j];
                        break method2;
                    }
                    i++;
                }
            }
        if(answer == 0)
        {
            return 69420360;
        }
        return answer;
    }
}