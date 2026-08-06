class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<1000000000;i++)
        {
            int num=i;
            int d=1;
            int r=0;
            while(num!=0)
            {
                r=num%10;
                d=d*r;
                num=num/10;
            }
            if(d%t==0)
            {
                System.out.println(d);
                return i;
            }
        }
        return 0;
    }
}