class Solution {
    public int countCommas(int n) {
        int d=n;
        int r=0;
        int s=0;
        while(n!=0)
        {
            r=n%10;
            s=s+1;
            n=n/10;
        }
        System.out.println(d-9999);
        if(s<4)
        {
            return 0;
        }
        return d-999;
    }
}