class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int c=0;
        for(int i=low;i<=high;i++)
        {
            String s=Integer.toString(i);
            if(s.length()%2==0)
            {
                int ls=0;
                int rs=0;
                for(int j=0;j<s.length()/2;j++)
                {
                    ls+=Integer.valueOf(s.charAt(j));
                }
                for(int j=s.length()/2;j<s.length();j++)
                {
                    rs+=Integer.valueOf(s.charAt(j));
                }
                if(ls==rs)
                {
                    c++;
                }
            }
        }
        return c;
    }
}