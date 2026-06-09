class Solution {
    public String trimTrailingVowels(String s) {
        String res="";
        String a="aeiou";
        int in=-1;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(!a.contains(String.valueOf(s.charAt(i))))
            {
                in=i;
                break;
            }
        }
        System.out.println(in);
        for(int i=0;i<=in;i++)
        {
            res+=s.charAt(i);
        }
        return res;
    }
}