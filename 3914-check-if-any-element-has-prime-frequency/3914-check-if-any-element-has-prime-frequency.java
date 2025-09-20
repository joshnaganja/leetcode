class Solution {
    public boolean prime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer,Integer> a=new HashMap<>();
        for(int i:nums)
        {
            a.put(i,a.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> e:a.entrySet())
        {
            int n=e.getValue();
            if(prime(n))
            {
                return true;
            }
        }
        return false;
    }
}