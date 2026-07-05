class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer,Integer> a=new HashMap<>();
        for(int i=lowLimit;i<=highLimit;i++)
        {
            int t=i;
            int r=0;
            int sum=0;
            while(t!=0)
            {
                r=t%10;
                sum+=r;
                t=t/10;
            }
            a.put(sum,a.getOrDefault(sum,0)+1);
        }
        ArrayList<Integer> m=new ArrayList<>();
        for(Map.Entry<Integer,Integer> e:a.entrySet())
        {
            m.add(e.getValue());
        }
        int maxi=Collections.max(m);
        return maxi;
    }
}