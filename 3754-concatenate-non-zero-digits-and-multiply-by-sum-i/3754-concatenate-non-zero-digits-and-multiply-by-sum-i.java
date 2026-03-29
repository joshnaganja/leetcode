class Solution {
    public long sumAndMultiply(int n) {
        String s=Integer.toString(n);
        String q="";
        for(char i:s.toCharArray())
        {
            if(i!='0')
            {
                q+=i;
            }
        }
        if(q!="")
        {
            long a=Integer.valueOf(q);
            long sum=0;
            long r=0;
            long copy=a;
            while(a!=0)
            {
                r=a%10;
                sum=sum+r;
                a=a/10;
            }
            return copy*sum;
        }
        return 0;
    }
}