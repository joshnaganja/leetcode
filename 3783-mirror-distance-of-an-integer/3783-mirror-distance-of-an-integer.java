class Solution {
    public int mirrorDistance(int n) {
        int r=0;
        int t=n;
        int s=0;
        while(t!=0)
        {
            r=t%10;
            s=s*10+r;
            t=t/10;
        }
        return Math.abs(n-s);
    }
}