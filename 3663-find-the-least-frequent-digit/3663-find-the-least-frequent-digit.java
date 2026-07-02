class Solution {
    public int getLeastFrequentDigit(int n) {
        ArrayList<Integer> a=new ArrayList<>();
        int t=n;
        int r=0;
        while(t!=0)
        {
            r=t%10;
            a.add(r);
            t=t/10;
        }
        Map<Integer,Integer> m=new HashMap<>();
        for(Integer i:a)
        {
            m.put(i,m.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> s=new ArrayList<>();
        for(Map.Entry<Integer,Integer> e:m.entrySet())
        {
            s.add(e.getValue());
        }
        int small=Collections.min(s);
        ArrayList<Integer> f=new ArrayList<>();
        for(Map.Entry<Integer,Integer> e:m.entrySet())
        {
            if(e.getValue()==small)
            {
                f.add(e.getKey());
            }
        }
        int res=Collections.min(f);
        return res;
    }
}