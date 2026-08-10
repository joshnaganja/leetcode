class Solution {
    public int sumCounts(List<Integer> nums) {
        ArrayList<Integer> r=new ArrayList<>();
        for(int i=0;i<nums.size();i++)
        {
            for(int j=i;j<nums.size();j++)
            {
                HashSet<Integer> a=new HashSet<>();
                for(int k=i;k<=j;k++)
                {
                    a.add(nums.get(k));
                }
                r.add(a.size());
            }
        }
        int s=0;
        for(int i:r)
        {
            s+=i*i;
        }
        return s;
    }
}