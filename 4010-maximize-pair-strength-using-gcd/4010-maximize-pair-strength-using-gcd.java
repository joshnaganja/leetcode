class Solution {
    public long maxPairStrength(int[] nums) {
        long r=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                long p=(long)nums[i]*nums[j];
                int a=nums[i];
                int b=nums[j];
                while(b!=0)
                {
                    int temp=b;
                    b=a%b;
                    a=temp;
                }
                long gcd=a;
                long g=gcd*gcd;
                long s=p/g;
                r=Math.max(r,s);
            }
        }
        return r;
    }
}