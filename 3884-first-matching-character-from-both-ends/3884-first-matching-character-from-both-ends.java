class Solution {
    public int firstMatchingIndex(String s) {
        String s2="";
        for(int i=s.length()-1;i>=0;i--)
        {
            s2+=s.charAt(i);
        }
        System.out.println(s2);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==s2.charAt(i))
            {
                return i;
            }
        }
        return -1;
    }
}