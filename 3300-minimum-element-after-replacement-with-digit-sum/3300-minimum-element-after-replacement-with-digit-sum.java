class Solution {
    public int minElement(int[] nums) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i:nums)
        {
            int t=i;
            int sum=0;
            int r=0;
            while(t!=0)
            {
                r=t%10;
                sum+=r;
                t=t/10;
            }
            a.add(sum);
        }
        int m=Collections.min(a);
        return m;
    }
}