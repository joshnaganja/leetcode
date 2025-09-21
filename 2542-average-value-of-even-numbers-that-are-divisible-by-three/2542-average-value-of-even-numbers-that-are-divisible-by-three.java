class Solution {
    public int averageValue(int[] nums) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i:nums)
        {
            if(i%2==0 && i%3==0)
            {
                a.add(i);
            }
        }
        int sum=0;
        for(Integer i:a)
        {
            sum+=i;
        }
        if(a.size()==0)
        {
            return 0;
        }
        return sum/a.size();
    }
}