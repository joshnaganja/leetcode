class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int res=Integer.MAX_VALUE;
        for(int k=l;k<=r;k++)
        {
            int ans=Integer.MAX_VALUE;
            int sum=0;
            int i=0;
            int j;
            for(j=0;j<k;j++)
            {
                sum+=nums.get(j);
            }
            if(sum>0)
            {
                ans=Math.min(ans,sum);
                System.out.println(ans);
            }
            while(j<nums.size())
            {
                sum-=nums.get(i);
                i++;
                sum+=nums.get(j);
                j++;
                if(sum>0)
                {
                    ans=Math.min(ans,sum);
                }
            }
            res=Math.min(res,ans);
        }
        return res!=Integer.MAX_VALUE?res:-1;
    }
}