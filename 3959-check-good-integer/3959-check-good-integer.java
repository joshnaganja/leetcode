class Solution {
    public boolean checkGoodInteger(int n) {
        int ds=0;
        int ss=0;
        int t=n;
        int r=0;
        while(t!=0)
            {
                r=t%10;
                ds+=r;
                ss+=r*r;
                t=t/10;
            }
        int q=ss-ds;
        if(q>=50)
        {
            return true;
        }
        return false;
    }
}