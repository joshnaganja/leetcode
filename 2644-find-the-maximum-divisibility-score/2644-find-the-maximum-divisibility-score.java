class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int c=0;
        HashMap<Integer,Integer> a=new HashMap<>();
        for(int i:divisors)
        {
            for(int j:nums)
            {
                if(j%i==0)
                {
                    c++;
                }
            }
            a.put(i,c);
            c=0;
        }
        ArrayList<Integer> r=new ArrayList<>();
        for(Map.Entry<Integer,Integer> e:a.entrySet())
        {
            r.add(e.getValue());
        }
        int m=Collections.max(r);
        ArrayList<Integer> q=new ArrayList<>();
        for(Map.Entry<Integer,Integer> e:a.entrySet())
        {
            if(e.getValue()==m)
            {
                q.add(e.getKey());
            }
        }
        System.out.println(m);
        int mini=Collections.min(q);
        return mini;
    }
}