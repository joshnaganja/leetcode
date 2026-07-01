class Solution {
    public int dominantIndices(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++)
        {
            int a=nums[i];
            int sum=0;
            int c=0;
            double avg=0;
            for(int j=i+1;j<nums.length;j++)
            {
                sum+=nums[j];
                c++;
            }
            if(c != 0)
            {
                avg = (double)sum / c;

                if(a > avg)
                {
                    res++;
                }
            }
        }
        return res;
    }
}