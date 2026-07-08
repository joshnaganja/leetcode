class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        HashSet<String> a=new HashSet<>();
        for(String i:bannedWords)
        {
            a.add(i);
        }
        int c=0;
        for(String i:message)
        {
            if(a.contains(i))
            {
                c++;
            }
        }
        if(c>=2)
        {
            return true;
        }
        return false;
    }
}