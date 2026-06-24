class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer> a=new HashMap<>();
        int sum=0;
        for(int i:nums)
        {
            a.put(i,a.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> e:a.entrySet())
        {
            if(e.getValue()%k==0)
            {
                sum+=e.getKey()*e.getValue();
            }
        }
        return sum;
    }
}