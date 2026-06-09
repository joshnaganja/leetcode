class Solution {
    public int firstUniqueEven(int[] nums) {
        LinkedHashMap<Integer,Integer> a=new LinkedHashMap<>();
        for(int i:nums)
        {
            a.put(i,a.getOrDefault(i,0)+1);
        }
        System.out.println(a);
        for(Map.Entry<Integer,Integer> e:a.entrySet())
        {
            if(e.getValue()==1 && e.getKey()%2==0)
            {
                return e.getKey();
            }
        }
        return -1;
    }
}