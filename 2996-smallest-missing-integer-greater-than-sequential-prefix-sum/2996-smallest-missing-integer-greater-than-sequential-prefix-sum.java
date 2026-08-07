class Solution {
    public int missingInteger(int[] nums) {
        int ind=0;
        int sum=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]+1!=nums[i+1])
            {
                ind=i+1;
                break;
            }
        }
        if(nums.length!=0 && ind==0)
        {
            ind=nums.length;
        }
        for(int i=0;i<ind;i++)
        {
            sum+=nums[i];
        }
        System.out.println(ind);
        ArrayList<Integer> a=new ArrayList<>();
        for(int i:nums)
        {
            a.add(i);
        }
        for(int i=sum;i<=100000;i++)
        {
            if(!a.contains(i))
            {
                return i;
            }
        }
        return 0;
    }
}