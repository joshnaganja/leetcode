class Solution {
    public int vowelConsonantScore(String s) {
        int v=0;
        int c=0;
        for(Character i:s.toCharArray())
        {
            if(Character.isDigit(i))
            {
                continue;
            }
            else if(i==' ')
            {
                continue;
            }
            else if("aeiou".indexOf(i) != -1)
            {
                v++;
            }
            else
            {
                c++;
            }
        }
        if(c>0)
        {
            return v/c;
        }
        return 0;
    }
}