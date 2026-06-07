class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] res=new int[nums.length*2];
        ArrayList<Integer> a=new ArrayList<>();
        for(int i:nums)
        {
            a.add(i);
        }
        Collections.reverse(a);
        System.out.println(a);
        for(int i=0;i<nums.length;i++)
        {
            res[i]=nums[i];
        }
        int k=0;
        for(int i=nums.length;i<nums.length*2;i++)
        {
            res[i]=a.get(k);
            k++;
        }
        return res;
    }
}