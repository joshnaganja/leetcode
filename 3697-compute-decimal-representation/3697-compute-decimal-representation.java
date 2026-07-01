class Solution {
    public int[] decimalRepresentation(int n) {
        ArrayList<Integer> a=new ArrayList<>();
        int t=n;
        int place=1;
        int r=0;
        while(t!=0)
        {
            r=t%10;
            if(r!=0)
            {
                a.add(r*place);
            }
            place=place*10;
            t=t/10;
        }
        int[] res=new int[a.size()];
        int k=a.size()-1;
        for(int i=0;i<a.size();i++)
        {
            res[i]=a.get(k);
            k--;
        }
        return res;
    }
}