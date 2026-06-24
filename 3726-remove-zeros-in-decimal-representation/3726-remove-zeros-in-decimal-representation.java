class Solution {
    public long removeZeros(long n) {
        String s=Long.toString(n);
        String r="";
        for(char i:s.toCharArray())
        {
            if(i=='0')
            {
                continue;
            }
            else
            {
                r+=i;
            }
        }
        System.out.println(r);
        return Long.valueOf(r);
    }
}