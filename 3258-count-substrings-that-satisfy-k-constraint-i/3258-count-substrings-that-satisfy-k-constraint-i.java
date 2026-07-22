class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        ArrayList<String> a=new ArrayList<>();
        for(int i=0;i<=s.length();i++)
        {
            for(int j=i+1;j<=s.length();j++)
            {
                a.add(s.substring(i,j));
            }
        }
        int c=0;
        for(String i:a)
        {
            int cone=0;
            int czero=0;
            for(int p=0;p<i.length();p++)
            {
                if(i.charAt(p)=='0')
                {
                    czero++;
                }
                else
                {
                    cone++;
                }
            }
            if(cone<=k || czero<=k)
            {
                c++;
            }
        }
        return c;
    }
}