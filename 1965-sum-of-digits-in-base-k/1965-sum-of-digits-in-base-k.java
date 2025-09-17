class Solution {
    public int sumBase(int n, int k) {
        String r=Integer.toString(n,k);
        int res=Integer.valueOf(r);
        int sum=0;
        int r1=0;
        while(res!=0)
        {
            r1=res%10;
            sum+=r1;
            res=res/10;
        }
        return sum;
    }
}