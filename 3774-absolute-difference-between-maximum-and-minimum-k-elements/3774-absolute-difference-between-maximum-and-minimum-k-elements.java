class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int a=0;
        int b=0;
        for(int i=0;i<k;i++)
        {
            a+=nums[i];
        }
        for(int i=nums.length-1;i>=nums.length-k;i--)
        {
            b+=nums[i];
        }
        System.out.println(a);
        System.out.println(b);
        return Math.abs(a-b);
    }
}