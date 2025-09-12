class Solution {
    public boolean checkDivisibility(int n) {
        int res=0;
        int sum=0;
        int prod=1;
        int t=n;
        int r=0;
        while(n!=0)
        {
            r=n%10;
            sum+=r;
            prod*=r;
            n=n/10;
        }
        res=sum+prod;
        if(t%res==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}