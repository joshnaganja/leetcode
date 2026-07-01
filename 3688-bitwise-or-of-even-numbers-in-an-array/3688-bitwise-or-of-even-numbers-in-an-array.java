class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i:nums)
        {
            if(i%2==0)
            {
                a.add(i);
            }
        }
        int or=0;
        for(int i:a)
        {
            or|=i;
        }
        return or;
    }
}