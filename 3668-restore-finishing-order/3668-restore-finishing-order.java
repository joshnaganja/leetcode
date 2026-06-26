class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] r=new int[friends.length];
        int k=0;
        ArrayList<Integer> a=new ArrayList<>();
        for(int i:friends)
        {
            a.add(i);
        }
        for(int i:order)
        {
            if(a.contains(i))
            {
                r[k]=i;
                k++;
            }
        }
        return r;
    }
}