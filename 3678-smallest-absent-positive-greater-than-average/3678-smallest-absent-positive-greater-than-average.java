class Solution {
    public int smallestAbsent(int[] nums) {
        int avg=0;
        int sum=0;
        for(int i:nums)
        {
            sum+=i;
        }
        avg=sum/nums.length;
        ArrayList<Integer> a=new ArrayList<>();
        for(int i:nums)
        {
            a.add(i);
        }
        if(avg<0)
        {
            avg=0;
        }
        for(int i=avg+1;i<=10000;i++)
        {
            if(!a.contains(i))
            {
                return i;
            }
        }
        return 0;
    }
}