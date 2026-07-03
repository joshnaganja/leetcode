class Solution {
    public boolean isSubstringPresent(String s) {
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        ArrayList<String> a=new ArrayList<>();
        for(int i=0;i<s.length()-1;i++)
        {
            a.add(s.substring(i,i+2));
        }
        ArrayList<String> a2=new ArrayList<>();
        for(int i=0;i<sb.length()-1;i++)
        {
            a2.add(sb.substring(i,i+2));
        }
        for(String i:a)
        {
            if(a2.contains(i))
            {
                return true;
            }
        }
        return false;
    }
}