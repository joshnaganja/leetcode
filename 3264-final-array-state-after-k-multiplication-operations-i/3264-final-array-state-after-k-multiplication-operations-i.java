class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i=1;i<=k;i++)
        {
            int min = Arrays.stream(nums).min().getAsInt();
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]==min)
                {
                    nums[j]=nums[j]*multiplier;
                    break;
                }
            }
        }
        return nums;
    }
}