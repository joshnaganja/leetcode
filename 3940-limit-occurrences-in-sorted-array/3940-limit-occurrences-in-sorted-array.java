class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        Map<Integer,Integer> a=new HashMap<>();
        for(int i:nums)
        {
            a.put(i,a.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> r=new ArrayList<>();
        for(Map.Entry<Integer,Integer> e:a.entrySet())
        {
            if(e.getValue()>=k)
            {
                for(int i=0;i<k;i++)
                {
                    r.add(e.getKey());
                }
            }
            else
            {
                for(int i=0;i<e.getValue();i++)
                {
                    r.add(e.getKey());
                }
            }
        }
        int[] res=new int[r.size()];
        for(int i=0;i<r.size();i++)
        {
            res[i]=r.get(i);
        }
        Arrays.sort(res);
        return res;
    }
}