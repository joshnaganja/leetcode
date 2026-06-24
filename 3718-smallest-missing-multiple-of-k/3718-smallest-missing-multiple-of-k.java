class Solution {
    public int missingMultiple(int[] nums, int k) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i:nums)
        {
            a.add(i);
        }
        for(int i=1;i<100000;i++)
        {
            if(!a.contains(i*k))
            {
                return i*k;
            }
        }
        return 0;
    }
}