class Solution {
    public long splitArray(int[] nums) {
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            boolean p=true;
            int n=i;
            if(n<=1)
            {
                p=false;
            }
            else
            {
                for(int j=2;j*j<=n;j++)
                {
                    if(n%j==0)
                    {
                        p=false;
                        break;
                    }
                }
            }
            if(p)
            {
                a.add(nums[i]);
            }
            else
            {
                b.add(nums[i]);
            }
        }
        long asum=0;
        long bsum=0;
        for(int i:a)
        {
            asum+=i;
        }
        for(int i:b)
        {
            bsum+=i;
        }
        return Math.abs(asum-bsum);
    }
}