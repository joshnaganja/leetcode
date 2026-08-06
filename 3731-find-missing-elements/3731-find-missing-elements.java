class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> r=new ArrayList<>();
        for(int i:nums)
        {
            a.add(i);
        }
        int s=Collections.min(a);
        int l=Collections.max(a);
        for(int i=s;i<=l;i++)
        {
            if(a.contains(i))
            {
                continue;
            }
            else
            {
                r.add(i);
            }
        }
        return r;
    }
}